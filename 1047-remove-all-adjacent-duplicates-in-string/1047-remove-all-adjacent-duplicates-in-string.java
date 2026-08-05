class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.empty() && st.peek() == c){
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.empty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}