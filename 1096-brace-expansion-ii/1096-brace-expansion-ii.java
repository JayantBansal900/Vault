class Solution {
    TreeSet<String> ans = new TreeSet<>();
    public List<String> braceExpansionII(String expression) {
        dfs(expression);
        return new ArrayList<>(ans);   
    }
    void dfs(String s){
        //step 1:
        int r = s.indexOf('}');
        //base conditon or step 5:
        if(r == -1){
            ans.add(s);
            return;
        }
        //step 2:
        int l = s.lastIndexOf('{',r);
        //step 3:
        String left = s.substring(0,l);
        String right = s.substring(r+1);
        String inside = s.substring(l+1,r);
        //step 4:
        for(String part: inside.split(",")){
            dfs(left + part + right);
        }
    }

}