//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.maxChars(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int maxChars(String S)
    {
        int max=-1,temp=-1;
        int length=S.length();
        for(int i=0;i<length-1;i++){
            int firstIndex=S.indexOf(S.charAt(i));
            int lastIndex=S.lastIndexOf(S.charAt(i));
            if(firstIndex==lastIndex){
                temp=-1;
            }
            else{
                temp=lastIndex-firstIndex-1;
            }
            if(temp>=max){
                max=temp;
            }
        }
        if(max==-1){
            return -1;
        }
        return max;
    }
}
