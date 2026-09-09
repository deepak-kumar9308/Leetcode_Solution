class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        for(int candy:candyType){
            set.add(candy);
        }
        int  max=candyType.length/2;
        if(max<set.size())
        return max;
        else
         return set.size();
    }
}