public static void listOperation(List<Integer> list1,List<Integer> list2,List<Integer> list3,List<Integer> list4,List<Integer> list5) {
	int size1=list1.size();
	for(int i=0;i<size1;i++) {
		int temp1=list1.get(i);
		if(!list3.contains(temp1)) {
			list3.add(temp1);
		}
		if(temp1%2==0) {
			list4.add(temp1);
		}
	}
	int size2=list2.size();
	for(int j=0;j<size2;j++) {
		int temp2=list2.get(j);
		if(!list3.contains(temp2)) {
			list3.add(temp2);
		}
		if(temp2%2!=0) {
			list4.add(temp2);
		}
		if(list1.contains(temp2)) {
			if(!list5.contains(temp2)) {
				list5.add(temp2);
			}
		}
	}
}
