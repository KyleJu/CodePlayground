public class ryan {

	public static void main(String[] args) {
		String s = "a;lkfdja;slkfj;alcard;afj3";
		String s1 = "car";
		String s2 = ";al";
		String s3 = "afj3";
		String s4 = "9i";
		System.out.println(find(s,s1)); // true
		System.out.println(find(s,s2)); //true
		System.out.println(find(s,s3)); //true
		System.out.println(find(s,s4));

	}
	public static boolean find(String s1, String s2) {


		if (s1.length() < s2.length()) {
			return false;
		}
		if (s1.equals(s2)) return true;
		int range = s2.length();
		// watch out for edges cases!!!! s1.length() - range + 1!!!!!!
		for (int i =0; i < s1.length() - range + 1; i ++) {
		  	int k = 0;
		  	boolean flag = true;

		  	while (k < range) {
		  		if (s1.charAt(i+k) != s2.charAt(k)) {
		  			flag = false;
		  			break;
		  		}
		  		k++;
		  	}

		  	if (flag) return true;
		}
		return false;
	}
}