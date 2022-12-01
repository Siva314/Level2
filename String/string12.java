class Solution {

    public String restoreString(String s, int[] indices) {

        int length=s.length();

        char[] strArr=new char[length];

        for(int i=0;i<length;i++){

            strArr[indices[i]]=s.charAt(i);

        }

        return String.valueOf(strArr);

    }

}
