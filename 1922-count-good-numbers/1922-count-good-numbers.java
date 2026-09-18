class Solution {
    long MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long ans = (pow(5,(n+1)/2) * pow(4,(n/2)) ) % MOD;
        return (int)ans;
    }
    public long pow(long a,long n){
        if(n==0) return 1;
        long half = pow(a,n/2);
        long result = (half * half) % MOD;
        if(n%2 == 1){
            result = (result*a)%MOD;
        }
        return result;
    }
}