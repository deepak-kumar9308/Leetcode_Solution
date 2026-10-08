class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       boolean[] isallowed=new boolean[26];
       for(char c:allowed.toCharArray()){
        isallowed[c-'a']=true;
       }

       int count=0;
       for(String word:words){
        boolean consistent=true;
          for(char c:word.toCharArray()){
            if(!isallowed[c-'a']){
                consistent=false;
                break;
            }
          }
          if(consistent){
            count++;
          }
       }
       return count;
    }
}