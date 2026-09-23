class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i = 0;i<n;i++){
            sum += nums[i];
            map.put(sum,i);
        }
        if(sum < x) return -1;
        int target = sum - x;
        int subArraylength = Integer.MIN_VALUE;
        sum = 0;
        for(int i =0;i<n;i++){
            sum += nums[i];
            if(map.containsKey(sum - target)){
                subArraylength = Math.max(subArraylength, i - map.get(sum - target));
            }
        }
        if(subArraylength == Integer.MIN_VALUE)return -1;
        else return n - subArraylength;
    }
}