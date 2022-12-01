//{ Driver Code Starts
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}


// } Driver Code Ends


class GfG
 {
	String encode(String str)
	{
          String s="";
          int count=1;
          char[] arr=str.toCharArray();
          int length=arr.length;
          for(int i=0;i<length-1;i++){
              char temp=arr[i];
              if(temp==arr[i+1]){
                  count++;
              }
              else{
                  s+=String.valueOf(temp)+""+count;
                  count=1;
              }
          }
          s+=String.valueOf(arr[length-1])+""+count;
          return s;
	}
	
 }
