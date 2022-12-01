package testing;

import java.util.*;

public class Test7 {
	
	public static void main(String[] args) {
		List<String> list=checkSubString("abcddefgikom","abdcdeffgklm");
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
	
	public static List<String> checkSubString(String str1,String str2){
		List<String> list1=new ArrayList<>();
		String temp1="",temp2="";
		int length1=str1.length();
		int length2=str2.length();
		if(length1==length2) {
			for(int i=0;i<length1;i++) {
				char t1=str1.charAt(i),t2=str2.charAt(i);
				if(t1!=t2) {
					temp1=temp1+String.valueOf(t1);
					temp2=temp2+String.valueOf(t2);
				}
				else if(!temp1.isEmpty()){
					String s=temp1+","+temp2;
					list1.add(s);
					temp1="";
					temp2="";
				}
			}
			return list1;
		}
		return null;
		
	}

}

