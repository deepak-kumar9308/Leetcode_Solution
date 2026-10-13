class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String str:sentences){
            int count=0;
            for(int i=0;i<str.length()-1;i++){
                if(str.charAt(i)==' '){
                    count++;
               }
        
            }
            count++;
            if(count>max){
                max=count;
            }
        }
        
        return max;
    }
}