import java.util.Scanner;

public class Check {
	//use an array
	static boolean checkUnique(String s) {
		if(s.length()>128) 
			return false;
		boolean[] array=new boolean[128]; //initialize to false
		for(int i=0;i<s.length();i++) { //no need to populate the array all at once
			int value=s.charAt(i);		
			if(array[value]) {
				return false;
			}
			array[value]=true;
		}
		return true;
	}
	//without additional data structure
	static boolean Checker(String s) {
		boolean mark=true;
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<i;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					mark=false;
				}
			}
		}
		return mark;
	}
	//only use 2 int --> 2*32=64 bits, use 52 bits, assume only letters
	static boolean bitChecker(String s) {
		int lowChecker=0;
		int capChecker=0;
		for(int i=0;i<s.length();i++) {
			int val=s.charAt(i)-'A';
			if(val>25) {
				val=s.charAt(i)-'a';
				if((lowChecker & (1 << val)) >0) {
					return false;
				}
				lowChecker = lowChecker|(1 << val);
			}
			else {				
				if((capChecker & (1 << val)) >0) {
					return false;
				}
				capChecker|=(1<<val);
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		System.out.println("Enter a string:");
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		s.close();
		System.out.println(checkUnique(input));
		System.out.println(Checker(input));
		System.out.println(bitChecker(input));
		
	}
}
