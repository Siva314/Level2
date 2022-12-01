//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        int firstLength=str1.length();
        int secondLength=str2.length();
        if(firstLength!=secondLength){
            return false;
        }
        Map<Character,Character> map1=new HashMap<>();
        Map<Character,Character> map2=new HashMap<>();
        
        for(int i=0;i<firstLength;i++)
        {
            char temp1=str1.charAt(i);
            char temp2=str2.charAt(i);
            if(map1.containsKey(temp1))
            {
                if(map1.get(temp1).equals(temp2))
                {
                map1.put(temp1,temp2);
                }
                else
                {
                    return false;
                }
            }
            else{
                map1.put(temp1,temp2);
            }
            if(map2.containsKey(temp2)){
                if(map2.get(temp2).equals(temp1)){
                    map2.put(temp2,temp1);
                }
                else{
                    return false;
                }
            }
            else
            {
                map2.put(temp2,temp1);
            }
        }
        if(map1.size()==map2.size())
        {
            return true;
        }
        return false;
    }
}
