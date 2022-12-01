public static int[] sevenUp(int[] arr) {
		int length=arr.length;
		List<Integer> list=new ArrayList<>();
		list.add(arr[0]);
		for(int i=0;i<length-1;i++) {
			if(arr[i]%7==0) {
				list.add(arr[i+1]);
			}
		}
		int size=list.size(),k=0;
		int[] a=new int[size];
		for(Integer j:list) {
			a[k]=j;
			k++;
		}
		return a;
	}
