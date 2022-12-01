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
        int length=S.length(),max=1,temp2=0,start=0;
        Map<Character,Integer> map=new HashMap<>();
        while(start<length){
            char temp=S.charAt(start);
            if(map.containsKey(temp)){
                temp2=Math.max(temp2,map.get(temp)+1);
            }
            map.put(temp,start);
            max=Math.max(max,map.get(temp)-temp2+1);
            start++;
        }
        return max;
    }
}
