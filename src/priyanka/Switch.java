package priyanka;
public class Switch {

	public static void main(String[] args) {
		int day=6;
		String dayString;
		//switch statements
		switch (day) {
		//case
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString ="tuesday";
			break;
		case 3:
			dayString ="Wednesday";
			break;
		case 4:
			dayString ="Thursday";
			break;
		case 5:
			dayString ="Friday";
			break;
		case 6:
			dayString = "Saturday";
			break;
		case 7:
			dayString = "Sunday";
			break;
			default:
				dayString = "Invalid day";
				
		}
		System.out.println(dayString);

	}

}
