class Solution {
    public String removeOuterParentheses(String s) {
        int balance = 0;
        StringBuilder ans = new StringBuilder();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(balance > 0){
                    ans.append(ch);
                }
                balance++;
            }else{
                if(balance>1){
                    ans.append(ch);
                }
                balance--;
            }
        }
        return ans.toString();
    }
}