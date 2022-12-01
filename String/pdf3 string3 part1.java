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
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String S){
        int length=S.length(),max=1,count=0,start=0,length2=0;
        List<Character> list=new ArrayList<>();
        while(start<length){
            char temp=S.charAt(start);
            if(list.contains(temp)){
                count++;
                start=count;
                max=Math.max(max,list.size());
                list=new ArrayList<>();
            }
            else{
                list.add(temp);
                start++;
            }
        }
        
        max=Math.max(max,list.size());
        return max;
    }
}
