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
            String string1 = read.readLine();
            String string2 = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.removeChars(string1,string2) );
        }
    }
}


// } Driver Code Ends


//User function Template for Java
class Solution{
    static String removeChars(String string1, String string2){
        char[] str=string2.toCharArray();
        int length=str.length;
        int index=-1;
        for(int i=0;i<length;i++){
            index=string1.indexOf(str[i]);
            while(index!=-1){
                string1=string1.substring(0,index)+string1.substring(index+1,string1.length());
                index=string1.indexOf(str[i]);
            }
        }
        return string1;
    }
}
