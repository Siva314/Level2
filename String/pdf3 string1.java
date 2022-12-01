//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.lps(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int lps(String s) {
        int length=s.length(),count=0,start=1;
        while(start<length){
            if(s.charAt(start)==s.charAt(count)){
                count++;
                start++;
            }
            else{
                start=start-count+1;
                count=0;
            }
        }
        return count;
    }
}
