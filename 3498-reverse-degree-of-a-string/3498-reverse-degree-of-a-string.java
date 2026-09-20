class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            int digit = ch - 'a' + 1;
            int reverse = 27-digit;
            int position = i+1;
            int product = reverse * position;
            sum += product;
        }
        return sum;
    }
}