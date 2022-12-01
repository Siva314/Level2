package testing;

import java.util.*;

class test2 {
    public static  List<String>findPermutation(char[] arr) {
    	List<String> list=new ArrayList<>();
    	List<String> list2=new ArrayList<>();
    	String str5="",str8="";
    	int length=arr.length;
    	permutation(arr,0,length,list2);
    	Iterator<String> it=list2.iterator();
    	while(it.hasNext()) {
    		str8=it.next();
    		char[] str3=str8.toCharArray();
    		str5="";
    		for(int i=0;i<str3.length;i++) {
    			str5=str5+str3[i];
    			if(!list.contains(str5)) {
    				int tLength=str5.length();
    				permutation(str5.toCharArray(),0,tLength,list);
    			}
    		}
    	}
    	Collections.sort(list);
    	return list;
    	
    }
    public static void permutation(char[] arr2,int start,int end,List<String> list) {
    	if(start==end) {
    		String t=String.valueOf(arr2);
    		if(!list.contains(t)) {
    			list.add(t);
    		}
    		
    	}
    	else {
			for(int i=start;i<end;i++) {
				swap(arr2,start,i);
				permutation(arr2,start+1,end,list);
				swap(arr2,start,i);
			}
		}
    	
    }
    
    private static void swap(char[] arr2, int start, int i) {
    	char sv=arr2[start];
    	arr2[start]=arr2[i];
    	arr2[i]=sv;
		
	}
	public static void main(String[] args) {
    	char[] str ={'s','f','g'};
    	System.out.println(findPermutation(str));
    }
}

