//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	 int length=M.length,count=0,temp=0;
    	 for(int i=0;i<length;i++){
    	     count=0;
    	     for(int j=0;j<length;j++){
    	         count+=M[i][j];
    	     }
    	     if(count==0){
    	         int index=i;
    	         temp=0;
    	         for(int k=0;k<length;k++){
    	             temp+=M[k][index];
    	         }
    	         if(temp==length-1){
    	             return index;
    	         }
    	     }
    	 }
    	 return -1;
    }
}
