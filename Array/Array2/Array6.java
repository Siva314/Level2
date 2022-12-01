public static List<Integer> findPairs(int[] arr,int k) {
	int length=arr.length,i=0,end=length-1;
	Arrays.sort(arr);
	List<Integer> pairList=new ArrayList<>();
	while(i<end) {
		int t1=arr[i],t2=arr[end];
		if(t1+t2==k) {
			pairList.add(t1);
			pairList.add(t2);
			i++;
		}
		else if(t1+t2>k) {
			end--;
		}
		else {
			i++;
		}
	}
	return pairList;
}
