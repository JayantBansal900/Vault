class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i = arr.length-1;i>=0;i--){
            ans.append(arr[i] + " ");
        }
        String st = ans.toString();
        return st.trim();
    }
}