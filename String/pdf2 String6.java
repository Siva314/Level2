//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String modify (String s)
    {
        StringBuilder sBuilder=new StringBuilder();
        char[] strArr=s.toCharArray();
        int length=strArr.length;
        for(char ch:strArr){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                sBuilder.append(ch);
            }
        }
        sBuilder.reverse();
        int j=0;
        for(int i=0;i<length;i++){
            char ch=strArr[i];
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                strArr[i]=sBuilder.charAt(j);
                j++;
            }
        }
        return String.valueOf(strArr);
    }
}
