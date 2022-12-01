//{ Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    void bitonicGenerator(long arr[], int n)
    {
        int l=0,k=0,t1,t2;
        if(n%2==0){
            t1=n/2;
            t2=t1;
        }
        else{
            t2=n/2;
            t1=t2+1;
        }
        
        long[] a=new long[t1];
        long[] b=new long[t2];
        
        for(int i=0;i<n;i++){
            if(i%2==0){
                a[l]=arr[i];
                l++;
            }
            else{
                b[k]=arr[i];
                k++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<t1;i++){
            arr[i]=a[i];
        }
        for(int j=t2-1;j>=0;j--){
            arr[t1]=b[j];
            t1++;
        }
        
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
            Solution ob = new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            ob.bitonicGenerator(a,n);
            for (int i = 0; i < n; i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
    }
}





// } Driver Code Ends
