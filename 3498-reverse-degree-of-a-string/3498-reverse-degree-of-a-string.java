class Solution {
    public int reverseDegree(String s) {
      String str=" zyxwvutsrqponmlkjihgfedcba";
      int degree=0;
      int i=1;
      for(char s1:s.toCharArray()){
        int val=str.indexOf(s1)*i;
        i++;
        degree+=val;
      }
      return degree;
    }
}