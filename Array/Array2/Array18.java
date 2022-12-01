public static int findSumOfGivenDigit(int num) {
	int sum=0;
	while(num>0) {
		sum+=num%10;
		num=num/10;
	}
	return sum;
}

public static int[] sortArrayUsingOneArray(int[] arr) {
	int length=arr.length;
	for(int i=0;i<length-1;i++) {			
		for(int j=i+1;j<length;j++) {
			int t1=findSumOfGivenDigit(arr[i]);
			int t2=findSumOfGivenDigit(arr[j]);
			if(t1>t2) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
	}
	return arr;
}
