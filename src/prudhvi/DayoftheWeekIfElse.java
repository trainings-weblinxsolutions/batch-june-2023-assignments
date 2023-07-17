package prudhvi;

public class DayoftheWeekIfElse {
    public static void main(String[] args) {

        int day = 7;
        String DayoftheWeek;
        if ( day == 1 )
        DayoftheWeek = "Monday";
        else if ( day == 2 )
        DayoftheWeek = "Tuesday";
        else if ( day == 3 )
        DayoftheWeek = "Wednesday";
        else if ( day == 4 )
        DayoftheWeek = "Thursday";
        else if ( day == 5 )
        DayoftheWeek = "Friday";
        else if ( day == 6 )
        DayoftheWeek = "Saturday";
        else
        DayoftheWeek = "Sunday" ;
        System.out.println ("Today is "+DayoftheWeek+"." ) ;
}
}
