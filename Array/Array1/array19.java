public static int[] findLocalMinima(int[] arr) {
		int length=arr.length;
		List<Integer> list=new ArrayList<>();
		if(arr[0]<=arr[1]) {
			list.add(arr[0]);
		}
		for(int i=1;i<length-1;i++) {
			int t1=arr[i-1],t2=arr[i],t3=arr[i+1];
			if(t1>=t2&&t2<=t3) {
				list.add(t2);
			}
		}
		if(arr[length-2]>=arr[length-1]) {
			list.add(arr[length-1]);
		}
		int size=list.size(),k=0;
		int[] temp=new int[size];
		for(Integer l:list) {
			temp[k]=l;
			k++;
		}
		return temp;
	}
