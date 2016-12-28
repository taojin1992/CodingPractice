import java.util.Scanner;

public class Palindrome {
	static boolean check(String in) {
		String input=in.toLowerCase();
		int[] table=new int[128];
		int countOdd=0;
		for(int i=0;i<input.length();i++) {
			int val=input.charAt(i);
			table[val]++;
		}
		for(int j=0;j<128;j++) {
			if(table[j]%2!=0&& j!=32) {// ascii value for space is 32
				countOdd++;
			}
		}
		if(countOdd>1) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner s=new Scanner(System.in);
		String string=s.nextLine();
		s.close();
		System.out.println(check(string));
	}
}
