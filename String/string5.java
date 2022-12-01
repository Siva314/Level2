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
            
            System.out.println(ob.reverseWords (s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseWords(String S)
    {
        StringBuilder sBuilder=new StringBuilder("");
        StringBuilder tempBuilder=new StringBuilder("");
        int length=S.length();
        char[] strArr=S.toCharArray();
        for(int i=0;i<length;i++){
            if(strArr[i]=='.'){
                if(tempBuilder.length()>0){
                    sBuilder.append(tempBuilder.reverse());
                    tempBuilder.setLength(0);
                }
                sBuilder.append(strArr[i]);
            }
            else{
                tempBuilder.append(strArr[i]);
            }
        }
        if(tempBuilder.length()>0){
                    sBuilder.append(tempBuilder.reverse());
                    tempBuilder.setLength(0);
        }
        return sBuilder.toString();
    }
}
