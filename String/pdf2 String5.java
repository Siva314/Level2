class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String s="1";
        String s2="",s3="";
        int count=1;
        for(int i=2;i<=n;i++)
        {
            char[] temp=s.toCharArray();
            int length=temp.length;
            s2="";
            for(int j=0;j<length;j++)
            {
                char s1=temp[j];
                if(j==length-1)
                {
                    s2=s2+count+String.valueOf(s1);
                    count=1;
                }
                else if(s1==temp[j+1])
                {
                    count++;
                }
                else
                {
                    s2= s2 + count+String.valueOf(s1);
                    count=1;
                }
            }
            s3=s2;
            s=s3;
            
        }
        return s3;
    }
}
