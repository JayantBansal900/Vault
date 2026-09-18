class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        generate(nums,0,curr,result);
        return result;
    }
    public void generate(int[] nums,int idx,List<Integer> curr,List<List<Integer>> result){
        if(idx == nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        generate(nums,idx+1,curr,result);
        curr.remove(curr.size()-1);
        generate(nums,idx+1,curr,result);
    }
}