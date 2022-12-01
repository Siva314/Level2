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
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.crossPattern(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static String crossPattern(String S){
        StringBuilder sBuilder=new StringBuilder();
        int length=S.length();
        for (int i = 0; i < length; i++) {
            int j = length - 1 - i;
            for (int k = 0; k < length; k++) {
                if (k == i || k == j)
                    sBuilder.append(S.charAt(k));
                else
                    sBuilder.append(" ");
            }
        }
        return sBuilder.toString();
    }
}
