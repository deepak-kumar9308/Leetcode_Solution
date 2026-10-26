class Solution {
    public int buyChoco(int[] prices, int money) {
        int n=prices.length;
        Arrays.sort(prices);
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++)
            {
                if(prices[i]+prices[j]<=money){
                    return money-(prices[i]+prices[j]);
                }else{
                    break;
                }
            }
        }
        return money;
    }
}