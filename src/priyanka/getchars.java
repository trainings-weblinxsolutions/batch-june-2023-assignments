package string;

public class getchars {

	public static void main(String[] args) {
		String str = "javastringchar";
		char[] dest = new char[14];
		try {
			str.getChars(0, 13, dest,  0);
			System.out.println(dest);
			}
		catch (Exception e) {
			System.out.println("Exception Thrown:" + e);
	
		}
		// TODO Auto-generated method stub

	}

}
