class Solution {
    public boolean checkIfPangram(String sentence) {
        // HashSet<Character> set=new HashSet<>();
        // if(sentence.length<26){
        //     return false
        // }
        // char sent=senctance.toCharArray();
        // for(int i=0;i<sentence.length;i++){
        //     set.add(sent[i]);
        // }
        // for()
        int arr[]=new int[26];
        int n=sentence.length();
        int i=0;
        while(i<n){
            char ch=sentence.charAt(i);
            arr[ch-'a']=1;
            i++;
        }
        for(i=0;i<26;i++){
            if(arr[i]==0){
                return false;
            }
        }
    return true;
    }
}