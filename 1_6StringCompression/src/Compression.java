import java.util.ArrayList;
import java.util.Scanner;
public class Compression {
	static String compress(String input) {
		StringBuilder s=new StringBuilder();
		int count=0;
		//int->string, Convert using Integer.toString(int)
		//Convert using String.valueOf(int)
		//Basically there are two ways to do that: the Character.toString(char) method of the Character class.
		//the String.valueOf(char ) method of the String Class.
		for(int i=0;i<input.length();i++) {	
			count++;
			if(i>=input.length()-1 || input.charAt(i)!=input.charAt(i+1)) {
				s.append(String.valueOf(input.charAt(i)));
				s.append(String.valueOf(count));
				count=0;
			}
		}
		
		if(s.length()<input.length()) {
			return s.toString();
		}
		else
			return input;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		s.close();
		String result=compress(input);
		System.out.println("Compressed:"+result);
	}
}
