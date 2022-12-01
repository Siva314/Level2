public static List<String> findMisMatchedElements(char[] arr1,char[] arr2) {
	int length=arr1.length;
	List<String> list=new ArrayList<>();
	String s1="",s2="";
	for(int i=0;i<length;i++) {
		char c1=arr1[i],c2=arr2[i];
		if(c1!=c2) {
			s1+=String.valueOf(c1);
			s2+=String.valueOf(c2);
			if(i!=length-1) {
			continue;
			}
		}
		if(!s1.isEmpty()) {
			list.add(s1);
			list.add(s2);
			s1="";
			s2="";
		}
	}
	return list;
}
