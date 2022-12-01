//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
	     if(x==0 ||x==1){
	         return x;
	     }
		long temp=0,count=0;
		long control=x/2;
		for(int i=1;i<=control;i++){
		    temp=i*i;
		    if(temp>x){
		        break;
		    }
		    count++;
		}
		return count;
	 }
}

