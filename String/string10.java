//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}


// } Driver Code Ends


class Solution {
    public static List<String> list;
    public List<String> find_permutation(String S) {
        list=new ArrayList<String>();
        char[] arr=S.toCharArray();
        permutation(arr,0,arr.length);
        Collections.sort(list);
        return list;
    }
    public static void permutation(char[] str,int start,int end){
        if(start==end){
            String string=String.valueOf(str);
            if(!list.contains(string)){
            list.add(string);
            }
        }
        else{
            for(int i=start;i<end;i++){
                swap(str,i,start);
                permutation(str,start+1,end);
                swap(str,i,start);
            }
        }
    }
    public static void swap(char[] strArr,int first,int second){
        char temp=strArr[first];
        strArr[first]=strArr[second];
        strArr[second]=temp;
    }
}
