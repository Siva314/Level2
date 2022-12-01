//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.count(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    static long count(int N)        
    {
        if(N==0){
            return 0;
        }
        if(N<4){
            return 1;
        }
        long count=0,number=1;
        for(int i=4;i<=N;i++){
            count=1;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count%2!=0){
                number++;
            }
        }
        return number;
    }
}
