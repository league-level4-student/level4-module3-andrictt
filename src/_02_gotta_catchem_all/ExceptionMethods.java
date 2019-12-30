package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double num, double denom)  throws IllegalArgumentException{
		if(denom == 0) {
			throw new IllegalArgumentException();
		}
		return num/denom;
	}
	public static String reverseString(String s) throws IllegalStateException{
		if (s.length() == 0) {
			throw new IllegalStateException();
		}
		String ss = "";
		for(int i = s.length(); i > 0; i--) {
			ss += s.substring(i - 1, i);
		}
		return ss;
	}
}
