//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        String[] arr=s.split("\\.");
        int count=0;
        int length=arr.length;
        int sLength=s.length();
        for(int i=0;i<sLength;i++){
            if(s.charAt(i)=='.'){
                count++;
            }
        }
        if(length==4 && count==3){
        for(int i=0;i<length;i++){
            String temp=arr[i];
            int length1=temp.length();
            int number=0;
            try{
                number=Integer.parseInt(temp);
            }
            catch(Exception e){
                return false;
            }
            if(number>255 || number<0 || ((number<10 && number>=0) && length1!=1)){
                return false;
            }
            
        }
            
        }
        else{
            return false;
        }
        return true;
    }
}
