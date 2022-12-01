class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int firstLength=word1.length;
        int secondLength=word2.length;
        StringBuilder firstBuilder=new StringBuilder();
        StringBuilder secondBuilder=new StringBuilder();
        for(int i=0;i<firstLength&&firstLength!=0;i++){
            firstBuilder.append(word1[i]);
        }
        for(int i=0;i<secondLength&&secondLength!=0;i++){
            secondBuilder.append(word2[i]);
        }
        return firstBuilder.toString().equals(secondBuilder.toString());
    }
}
