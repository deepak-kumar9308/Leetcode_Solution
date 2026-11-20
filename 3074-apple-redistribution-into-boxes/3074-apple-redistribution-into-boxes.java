class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
    int total_apple=0;
    for(int n:apple){
        total_apple+=n;
    }
    Arrays.sort(capacity);
    int box=0;
    int count=0;
    for(int m=capacity.length-1;m>=0;m--){
        box+=capacity[m];
        count++;
        if(box>=total_apple){
            return count;
        }    
    }
    return count;
    }
}