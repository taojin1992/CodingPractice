import java.util.Scanner;

public class OneWayCheck {
	static boolean check(String s1, String s2) {
		char[] array1=s1.toCharArray();
		char[] array2=s2.toCharArray();
		int mark=0;
		int count=0;
		//guarantee abs(s1.length()-s2.length())<=1
		//case1
		if(s1.length()==s2.length()) {
			for(int i=0;i<Math.min(s1.length(), s2.length());i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					count++;
				}
				if(count>1) {
					return false;
				}
			}
			return true;
		}
		//case2
		//s2 longer
		if(s1.length()+1==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					mark=i;
				}
			}
			if(mark!=0) {
			for(int i=mark;i<s1.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i+1)) {
					return false;
				}
			} }
			return true;
		}
		//s1 longer
		if (s1.length() - 1 == s2.length()) {
			for (int i = 0; i < s2.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					mark = i;
				}
			}
			if(mark!=0) {
			for (int i = mark; i < s2.length(); i++) {
				if (s1.charAt(i+1) != s2.charAt(i)) {
					return false;
				}
			} }
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String[] input=new String[2];
		String s1,s2;
		System.out.print("Please enter two Strings, separated with a comma: "); 
		Scanner s=new Scanner(System.in);
		input=s.nextLine().split(",");
		s.close();
		s1=input[0];
		s2=input[1];
		System.out.println(s1+","+s2+" -> "+check(s1,s2));
	}
}
