//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String N = sc.next ();

            if (new Sol().balancedNumber (N))
    		    System.out.println (1);
    		else
    		    System.out.println (0);
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    Boolean balancedNumber(String N)
    {
        int length=N.length();
        int mid=length/2,sum1=0,sum2=0;
        for(int i=0;i<mid;i++){
            sum1+=Integer.parseInt(String.valueOf(N.charAt(i)));
        }
        for(int j=mid+1;j<length;j++){
            sum2+=Integer.parseInt(String.valueOf(N.charAt(j)));
        }
        return sum1==sum2;
    }
}
