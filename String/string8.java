//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            String str = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine().trim());
            Solution obj = new Solution();
            if(obj.kPangram(str, k))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean kPangram(String str, int k) 
    {
        char[] tempArr=str.replaceAll(" ","").toCharArray();
        int length=tempArr.length;
        if(length<26){
            return false;
        }
        int[] arr=new int[26];
        for(int i=0;i<length;i++){
            arr[tempArr[i]-'a']=1;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(arr[i]!=1){
               count++; 
            }
        }
        if(count==0){
            return true;
        }
        else if(count<=k){
            return true;
        }
        return false;
    }
}
