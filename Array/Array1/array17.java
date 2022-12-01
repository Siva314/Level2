public static int findNonRepeat(int[] arr) {
		Arrays.sort(arr);
		int length=arr.length,count=0;
		for(int i=0;i<length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				if(count==0) {
					return arr[i];
				}
				count=0;
			}
		}
		return arr[length-1];
	}
