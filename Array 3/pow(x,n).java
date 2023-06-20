class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n<0) return 1/powerfind(x,n);
        return powerfind(x,n);
    }
    public double powerfind(double x, int n){
        if(n==0) return 1;
        double ans = 1.0;
        ans = powerfind(x*x,n/2);

        if(n%2 !=0) ans = ans * x;

        return ans;
    
    }
}