public static void findDuplicated(int[] arr) {
	int length=arr.length;
	for(int i=0;i<length;i++) {
		int temp=arr[i],count=0;
		if(temp!=-1) {
			for(int j=i;j<length;j++) {
				int temp2=arr[j];
				if(temp==temp2) {
					count++;
					arr[j]=-1;
				}
			}
			System.out.println(temp+" "+count);
		}
	}
}
