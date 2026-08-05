class Solution {
    public String reverseWords(String s) {
        String[] temp = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<temp.length;i++){
            StringBuilder nw = new StringBuilder(temp[i]);
            sb.append(nw.reverse());
            if(i!=temp.length-1) sb.append(" ");
        }
        return sb.toString();
    }
}