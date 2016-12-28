import java.util.Scanner;

public class URLIFY {
	static String replace(String input, int trueLength) {
		int size=input.length();
		char[] array=new char[size]; 
		int j=0,i=0;
		while(i<trueLength) {			
			if(input.charAt(i)!=' ') {
				array[j]=input.charAt(i);
			}
			if(input.charAt(i)==' ') {
				array[j++]='%';
				array[j++]='2';
				array[j]='0';
			}
			j++;
			i++;
		}
		return new String(array);		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the string:");	
		Scanner s=new Scanner(System.in);
		String string=s.nextLine();
		int trueSize=s.nextInt();
		System.out.println(replace(string,trueSize));
		s.close();
	}
}
