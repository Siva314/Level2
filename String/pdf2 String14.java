class Solution {

    public boolean checkInclusion(String s1, String s2) {
        char[] strArr=s1.toCharArray();
        Arrays.sort(strArr);
        int length1=strArr.length;
        int length2=s2.length();
        char[] temp=new char[length1];
        for(int i=0;i<=length2-length1;i++){
            temp=s2.substring(i,i+length1).toCharArray();
            Arrays.sort(temp);
            if(Arrays.equals(strArr,temp)){
                return true;
            }
        }
        return false;
    }
}
