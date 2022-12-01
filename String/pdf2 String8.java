//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine();

            Solution ob = new Solution();

            System.out.println(ob.encryptString(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String encryptString(String S){
        StringBuilder sBuilder=new StringBuilder();
        char[] strArr=S.toCharArray();
        int count=1;
        int length=strArr.length;
        for(int i=length-1;i>=0;i--){
            char temp=strArr[i];
            if(i!=0){
                if(strArr[i-1]==temp){
                count++;
                }
                else{
                    sBuilder.append(Integer.toHexString(count));
                    sBuilder.append(temp);
                    count=1;
                }
            }
            else{
                    sBuilder.append(Integer.toHexString(count));
                    sBuilder.append(temp);                
            }
            
        }
        
        
        return sBuilder.toString();
    }
}
