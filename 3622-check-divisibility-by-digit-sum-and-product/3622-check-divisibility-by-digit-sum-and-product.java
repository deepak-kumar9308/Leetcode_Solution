class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int x=n;
        while(x>0){
            int r=x%10;
            sum+=r;
            mul*=r;
            x/=10;
        }
        if(n%(sum+mul)==0){
            return true;
        }

        return false;
    }
}