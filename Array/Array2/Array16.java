public static int findSumDigit(int num) {
	String temp=String.valueOf(num);
	if(num<10) {
		temp+=String.valueOf(10-num);
	}
	else {
		int t1=0,t2=0;
		while(num>0) {
			t1=num%10;
			t2+=t1;
			num=num/10;
		}
		temp+=String.valueOf(10-t2);
	}
	return Integer.parseInt(temp);
}
