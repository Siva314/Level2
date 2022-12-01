package testing;

public class Test4 {
	public static void main(String[] args) {
		System.out.println(convertToString(9999));
	}
	
	public static String convertToString(int number) {
		if(number==0) {
			return "Zero";
		}
		String[] belowTwenty= {"","one","two","three","four","five","six","seven",
				"eight","nine","ten",      "eleven",  "twelve",
	            "thirteen",  "fourteen", "fifteen", "sixteen",
	            "seventeen", "eighteen", "nineteen" };
		String[] twos= { "",       "",        "twenty",
                "thirty", "forty",   "fifty",
                "sixty",  "seventy", "eighty",
                "ninety" };
		String[] more= {
				"hundred","thousand"
			};
		System.out.println();
		char[] arr=String.valueOf(number).toCharArray();
		int length=arr.length;
		String format="";
		if(length<5&&length>0) {
			format="";
			switch(length) {
			case 4:{
				int tp1=Integer.parseInt(String.valueOf(arr[length-4]));
				format+=belowTwenty[tp1]+" "+more[1]+" ";
			}
			case 3:{
				int tp2=Integer.parseInt(String.valueOf(arr[length-3]));
				format+=belowTwenty[tp2]+" "+more[0]+" ";
			}
			case 2:{
				char t5=arr[length-2];
				if(t5=='1') {
					String t6=String.valueOf(t5)+String.valueOf(arr[length-1]);
					int t7=Integer.parseInt(t6);
					format+=belowTwenty[t7];
					break;
				}
				else {
					int tp3=Integer.parseInt(String.valueOf(arr[length-2]));
					format+=twos[tp3]+" ";
				}
			}
			case 1:{
				int tp4=Integer.parseInt(String.valueOf(arr[length-1]));
				format+=belowTwenty[tp4];
				break;
			}
			}
		}
		return format;
	}

}

