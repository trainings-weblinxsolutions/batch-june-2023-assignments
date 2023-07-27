package string;

public class regionsmethod {

	public static void main(String[] args) {
		String str1 = new String("Priyanka Reddy");
        String str2 = new String("priyanka");
        String str3 = new String("PRIYANKA");
 
        // Comparing str1 and str2 substrings
        System.out.print(
            "Result of comparing String 1 and String 2 : ");
        System.out.println(
            str1.regionMatches(true, 0, str2, 0, 8));
 
        // Comparing str1 and str3 substrings
        System.out.print(
            "Result of comparing String 1 and String 3 : ");
        System.out.println(
            str1.regionMatches(false, 0, str3, 0, 8));
 
        // Comparing str2 and str3 substrings
        System.out.print(
            "Result of comparing String 2 and String 3 : ");
        System.out.println(
            str2.regionMatches(true, 0, str3, 0, 8));
    

		
		//Equals method
		
		
		String celebrity1 = "Rajnikanth";
		String celebrity2 = "rajniKantH";
		
		System.out.println("Comparing Celebrity : "+celebrity1.equals(celebrity2));
		System.out.println("Comparing Celebrity : "+celebrity1.equalsIgnoreCase(celebrity2));
		
		
		// TODO Auto-generated method stub

	}

}
