//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Long t = Long.parseLong(read.readLine());
        while(t-- > 0)
        {
            long N = Long.parseLong(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPallindrome(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long isPallindrome(long N){
        if(N==0 || N==1){
            return 1;
        }
        long[] arr=new long[64];
        int i=0;
        while(N>0){
            arr[i]=N%2;
            N=N/2;
            i++;
        }
        long[] arr2=new long[i-1];
        for(int j=0;j<i-1;j++){
            arr2[j]=arr[i-1-j];
        }
        for(int j=0;j<i-1;j++){
            if(arr[j]!=arr2[j]){
                return 0;
            }
        }
        return 1;
    }
}
