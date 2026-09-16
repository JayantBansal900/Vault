class Solution {
    public int repeatedStringMatch(String a, String b) {
        String ans = "";
        int count = 0;
        while(ans.length() < b.length()){
            ans = ans + a;
            count++;
        }
        if(ans.indexOf(b) != -1){
            return count;
        }
        ans = ans + a;
        count++;
        if(ans.indexOf(b) != -1){
            return count;
        }
        return -1;
    }
}