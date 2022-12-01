//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String s;
            s = br.readLine();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseWithSpacesIntact(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    String reverseWithSpacesIntact(String S)
    {
        int length=S.length();
        char[] strArr=S.toCharArray();
        char[] strArr2=new char[length];
        for(int i=0;i<length;i++){
            if(strArr[i]==' '){
                strArr2[i]=' ';
            }
        }
        char[] strArr3=S.replaceAll(" ","").toCharArray();
        int j=strArr3.length-1;
        for(int i=0;i<length;i++){
            if(strArr2[i]!=' '){
                if(strArr3[j]==' '){
                    j--;
                }
                if(strArr3[j]!=' '){
                strArr2[i]=strArr3[j];
                j--;
                }
            }
        }
        return String.valueOf(strArr2);
    }
}
