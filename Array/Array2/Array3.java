//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            int ans[] = ob.sumClosest(arr, x);
            System.out.print(ans[0]+" "+ans[1]);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int[] sumClosest(int[] arr, int x) {
        int length=arr.length,i=0,end=length-1,min=Integer.MAX_VALUE;
        int[] a=new int[2];
        while(i<end){
            int t1=arr[i],t2=arr[end],t3=t1+t2,t4=Math.abs(t3-x);
            if(t4<min){
                a[0]=t1;
                a[1]=t2;
                min=t4;
            }
            if(t3>x){
                end--;
            }
            else{
                i++;
            }
        }
        return a;
    }
}
