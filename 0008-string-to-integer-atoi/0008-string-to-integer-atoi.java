class Solution {
    public int myAtoi(String s) {
        s = s.trim();                       
        if (s.length() == 0) return 0;
        int i = 0;
        int sign = 1;
        long ans = 0;                        
        if (s.charAt(0) == '-') { sign = -1; i++; }
        if (s.charAt(0) == '+') { i++; }
        while (i < s.length()) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) break; 
            int digit = c - '0'; 
            ans = ans * 10 + digit;      
            if (ans * sign >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
                i++;
        if (ans * sign <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int) (ans * sign);            
    }
}