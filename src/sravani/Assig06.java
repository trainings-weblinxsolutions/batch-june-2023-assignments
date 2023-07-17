package sravani;

import java.util.Scanner;

public class Assig06 {

	/*
	 * printing the day of a week using switch - case
	 */

	public static void main(String[] args) {

		int num = 5;
		String day;
		switch (num) {

		case 1:
			day = "Monday";
			break;

		case 2:
			day = "Tuesday";
			break;

		case 3:
			day = "Wednesday";
			break;

		case 4:
			day = "Thursday";
			break;

		case 5:
			day = "Friday";
			break;

		case 6:
			day = "Satday";
			break;

		case 7:
			day = "Sunday";
			break;

		default:
			day = "unknown";
			break;

		}
		System.out.println("The day you selected is: " + day);

		/*
		 * printing the day of a week using if else
		 */

//		int num = 8;
//		String day;
//		if( num==1) {
//			day = "Monday";
//		}
//		else if(num==2) {
//			day = "Tuesday";
//		}
//		else if(num==3) {
//			day = "Wednesday";
//		}
//		else if(num==4) {
//			day = "Thursday";
//		}
//		else if(num==5) {
//			day = "Friday";
//		}
//		else if(num==6) {
//			day = "Saturday";
//		}
//		else if(num==7) {
//			day = "Sunday";
//		}
//		else {
//			day ="Unknown";
//		}
//		System.out.print("The day os a week is : ");
//		System.out.println(day);
		

		/*
		 * using if else and scanner
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Please enter the number between 1-7 : ");
		 * 
		 * int num = sc.nextInt();
		 * 
		 * String day; if( num==1) { day = "Monday"; } else if(num==2) { day =
		 * "Tuesday"; } else if(num==3) { day = "Wednesday"; } else if(num==4) { day =
		 * "Thursday"; } else if(num==5) { day = "Friday"; } else if(num==6) { day =
		 * "Saturday"; } else if(num==7) { day = "Sunday"; } else { day ="Unknown"; }
		 * System.out.print("The day os a week is : "); System.out.println(day);
		 */

	}

}
