//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = sc.nextInt();
            Solution ob = new Solution();
            int[] ans = ob.common_digits(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] common_digits(int[] nums)
    {
        List<Integer> list=new ArrayList<>();
        int length=nums.length,temp;
        for(int i=0;i<length;i++){
            while(nums[i]!=0){
                temp=nums[i]%10;
                nums[i]=nums[i]/10;
                if(!list.contains(temp)){
                    list.add(temp);
                }
            }
        }
        Collections.sort(list);
        int size=list.size();
        int[] t1=new int[size];
        for(int k=0;k<size;k++){
            t1[k]=list.get(k);
        }
        return t1;
    }
}
