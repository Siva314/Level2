//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().closestToZero (arr, n));
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int closestToZero (int arr[], int n)
    {
        int max=Integer.MAX_VALUE,sum=0,start=0,end=n-1;
        boolean flag=false;
        Arrays.sort(arr);
        while(start<end){
            sum=arr[start]+arr[end];
            if(sum==1){
                flag=true;
            }
            if(sum==0){
                return 0;
            }
            if(Math.abs(sum)<Math.abs(max)){
                max=sum;
            }
            if(sum>0){
                end--;
            }
            else{
                start++;
            }
        }
        if(flag){
            return 1;
        }
        return max;
    }
}
