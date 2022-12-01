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
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int K = Integer.parseInt(input_line[1]);
            input_line = read.readLine().trim().split("\\s+");
            int candies[]= new int[N];
            for(int i = 0; i < N; i++)
                candies[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            ArrayList<Integer> cost = ob.candyStore(candies,N,K);
            System.out.println(cost.get(0)+" "+cost.get(1));
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    static ArrayList<Integer> candyStore(int candies[],int N,int K){
        Arrays.sort(candies);
        ArrayList<Integer> list=new ArrayList<>();
        if(K==0){
            int temp=findSum(candies,N,K);
            list.add(temp);
            list.add(temp);
        }
        else{
            list.add(findSum(candies,N,K));
            list.add(findMaximum(candies,N,K));
            
        }
        return list;
        
    }
    static int findSum(int[] arr,int size,int end){
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
            size-=end;
            
        }
        return sum;
    }
    static int findMaximum(int arr[], int n, int k)
    {
        int res = 0, index = 0;
        
        for (int i = n - 1; i >= index; i--)
            {
                res += arr[i];
                index += k;
            }
        return res;
    }
}
