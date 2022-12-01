//{ Driver Code Starts
//initial code
import java.util.Scanner;
import java.lang.*;
class MiddlePattern
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String s=sc.next();
            GfG g=new GfG();
            g.printPattern(s);
            System.out.println();
            t--;
        }
    }
}


// } Driver Code Ends


class GfG
{
/*method prints the given pattern in a single line */
	void printPattern(String s)
	{
	    int length=s.length();
	    int middle=length/2;
	    String name=s.substring(middle,middle+1);
	    System.out.print(name+"$ ");
	    for(int i=0;i<length-1;i++){
	        middle++;
	        if(middle==length){
	            middle=0;
	        }
	        name=name.concat(s.substring(middle,middle+1));
	        System.out.print(name+"$ ");
	    }
	}
}


