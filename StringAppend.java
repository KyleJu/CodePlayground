import java.util.*;

public class a {
	public static void main(String[] args) {
		String s = "I love food";
		System.out.println(rev(s));
	}

	public static String rev(String s) {
		int left = 0; 
		StringBuilder sb = new StringBuilder("");
		for (int i = 0 ;i< s.length(); i++) {
			//bug1: last string will not be processed
			if (s.charAt(i) != ' ' && i != s.length()-1) continue;
			//bug2 last string appened
			if (i == s.length()-1) i++;
			System.out.println(i);
			StringBuilder tm = new StringBuilder("");
			for (int j = left; j <i; j++) {
				tm.append(s.charAt(j));
			}

			sb.append(re(tm.toString()) + " ");
			i++;
			left = i;
		}
		return sb.toString();
	}

	public static String re(String s) {
		StringBuilder sb = new StringBuilder("");
		for (int i = s.length() -1 ;i >=0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}