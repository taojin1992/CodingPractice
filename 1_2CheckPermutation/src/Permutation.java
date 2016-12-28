import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
	//use two arrays
	static boolean checkPermutation(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		int[] array1=new int[128];
		int[] array2=new int[128];		
		for(int i=0;i<s1.length();i++) {
			int val1=s1.charAt(i);
			array1[val1]++;
		}
		for(int j=0;j<s2.length();j++) {
			int val2=s2.charAt(j);
			array2[val2]++;
		}
		boolean Result = Arrays.equals(array1,array2);
		return Result;
	}
	//first sort the strings, then compare
	static String sort(String s) {
		char[] array=s.toCharArray();
		java.util.Arrays.sort(array);
		return new String(array);
	}
	
	static Boolean compare(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		return sort(s1).equals(sort(s2));
	}
	
	public static void main(String[] args) {
		String[] input=new String[2];
		String s1,s2;
		System.out.print("Please enter two Strings, separated with a space: "); 
		Scanner s=new Scanner(System.in);
		input=s.nextLine().split(" ");
		s.close();
		s1=input[0];
		s2=input[1];
		System.out.println("Decide s1 is a permutation of s2: "+checkPermutation(s1,s2));
		System.out.println("Decide s1 is a permutation of s2: "+compare(s1,s2));
	}
}
