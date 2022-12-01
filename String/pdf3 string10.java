public class MagicalString {
	public static void main(String[] args) {
		System.out.println(findMagicalString("abcdefg","ghjkilu"));
	}
	public static String findMagicalString(String str1,String str2) {
		if(str1.equals(str2)) {
			return "No such String";
		}
		char[] temp1=str1.toCharArray();
		char[] temp2=str2.toCharArray();
		int length1=temp1.length;
		int length2=temp2.length;
		boolean flag=false;
		if(length1==length2) {
			for(int i=0;i<length1;i++) {
				int t1=temp1[i]-'a';
				int t2=temp2[i]-'a';
				if(t1<=t2) {
					flag=true;
				}
				else {
					return "No such String";
				}
				int t7=t2-t1;
				if(flag && t7>2) {
					temp1[i]++;
				}
			}
		}
		temp1[length1-1]++;
		String str8=String.valueOf(temp1);
		if(str8.equals(str1) || str8.equals(str2)) {
			return "No such String";
		}
		return str8;
	}
}
