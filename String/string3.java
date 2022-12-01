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
            char ch = read.readLine().charAt(0);
            int count = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            String result = ob.printString(s,ch,count);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String printString(String S, char ch, int count) {
        if(count==0){
			return S;
		}
		int length=S.length();
		int myCounter=0,myPosition=0;
		String temp="";
		boolean flag=false;
		for(int i=0;i<length;i++){
			if(S.charAt(i)==ch){
				myCounter++;
			}
			if(myCounter==count){
				myPosition=i;
				flag=true;
				myCounter++;
			}
		}
		if(flag){
			temp=S.substring(myPosition+1);
			if(temp.length()>0){
				return temp;
			}
			else{
				return "Empty string";
			}
		}
		return "Empty string";
    }
}
