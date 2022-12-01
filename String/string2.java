//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> arr = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            arr.add(p);
                        }
                    String line = sc.next();
                    Sol obj = new Sol();  
                    System.out.println(obj.wordBreak(line,arr));  
                    
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int wordBreak(String A, ArrayList<String> B )
    {
       if(wordBreakCheck(A,B)){
           return 1;
       }
       else{
           return 0;
       }
    }
    
    public static boolean wordBreakCheck(String A, ArrayList<String> B){
        int size=A.length();
        
        if(size==0){
            return true;
        }
        
        for(int i=1;i<=size;i++){
            if(B.contains(A.substring(0,i)) && wordBreakCheck(A.substring(i,size),B)){
                return true;
            }
        }
        return false;
    }
}
