//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            String arr[] = in.readLine().trim().split("\\s+");
            int mat[][] = new int[n][m];
            for(int i = 0;i < n*m;i++)
                mat[i/m][i%m] = Integer.parseInt(arr[i]);
            int x = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.isSuperSimilar(n, m, mat, x));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int isSuperSimilar(int n, int m, int mat[][], int x)
    {
        int temp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp[i][j]=mat[i][j];
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<n;j++){
                if(j%2==0){
                    int temp2=mat[j][0];
                    for(int k=0;k<m-1;k++){
                        mat[j][k]=mat[j][k+1];
                    }
                    mat[j][m-1]=temp2;
                }
                else{
                    int temp1=mat[j][m-1];
                    for(int k=m-1;k>0;k--){ 
                       mat[j][k]=mat[j][k-1];
                    }
                    mat[j][0]=temp1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]!=temp[i][j]){
                    return 0;
                }
            }
        }
        return 1;
    }
}
