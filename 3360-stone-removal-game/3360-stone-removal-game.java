class Solution {
    public boolean canAliceWin(int n) {
        int chance=10;
        int count=0;
        while(n>=chance){
            n=n-chance;
            chance--;
            count++;
        }
        if(count % 2!=0){
            return true;
        }
        return false;
    }
}