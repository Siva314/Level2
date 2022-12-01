public class Test5 {
	
	public static void main(String[] args) {
		System.out.println(checkContains("Hello from here","erHello from he"));
	}
	
	public static String checkContains(String str1,String str2) {
		str1=str1+str1;
		if(str1.contains(str2)) {
			return "yes";
		}
		return "no";
	}

}
