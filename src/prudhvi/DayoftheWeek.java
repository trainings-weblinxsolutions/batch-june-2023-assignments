package prudhvi;

public class DayoftheWeek {
    public static void main(String[] args) {

        int day = 3;
        String DayoftheWeek;
        switch (day) {
            case 1:
                DayoftheWeek = "Monday";
                break;
            case 2:
                DayoftheWeek = "Tuesday";
                break;
            case 3:
                DayoftheWeek = "Wednesday";
                break;
            case 4:
                DayoftheWeek = "Thursday";
                break;
            case 5:
                DayoftheWeek = "Friday";
                break;
            case 6:
                DayoftheWeek = "Saturday";
                break;
            default:
            DayoftheWeek = "Sunday" ;
        }
        System.out.println ("Today is "+DayoftheWeek+"." ) ;
}
}
