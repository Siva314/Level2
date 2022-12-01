class Solution {
    public boolean checkIfPangram(String sentence) {
        int length=sentence.length();
        char[] str=sentence.toCharArray();
        if(length<26){
            return false;
        }
        int[] intArr=new int[26];
        for(int i=0;i<length;i++){
            intArr[str[i]-'a']=1;
        }
        for(int i=0;i<26;i++){
            if(intArr[i]==0){
                return false;
            }
        }
        return true;
    }
}
