//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;
class GFG {
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
    	int t=sc.nextInt();
    	while(t-->0)
    	{
    		String str1=sc.next();
    		String str2=sc.next();
    		int k=sc.nextInt();
            Solution ob = new Solution();
    		if (ob.areKAnagrams(str1, str2, k) == true)
    			System.out.println("1");
    		else
    			System.out.println("0");
    	}
    }
}
// } Driver Code Ends


//User function template for JAVA

class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        int firstLength=s1.length();
        int secondLength=s2.length();
        if(firstLength!=secondLength){
            return false;
        }
        int[] temp1=new int[26];
        int[] temp2=new int[26];
        for(int i=0;i<firstLength;i++){
            temp1[s1.charAt(i)-'a']++;
            temp2[s2.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(temp1[i]>temp2[i]){
                count=count+Math.abs(temp1[i]-temp2[i]);
            }
        }
        if(count<=k){
            return true;
        }
        return false;
    }
}
