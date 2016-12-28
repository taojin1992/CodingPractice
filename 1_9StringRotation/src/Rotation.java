
public class Rotation {
	static boolean isRotation(String s1,String s2) {//s2 is a rotation of s1
		//use one call to isSubstring
		int len=s1.length();
		if(len>0 && len==s2.length()) {
			String str=s1+s1;
			return isSubstring(str,s2);
		}
		return false;
	}

	private static boolean isSubstring(String str, String s2) {
		// TODO Auto-generated method stub
		//this is given
		return false;
	}
}
