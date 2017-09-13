import java.util.Calendar;
import java.util.Date;

/**
 *
 You are given the following information, but you may prefer to do some research for yourself.

 1 Jan 1900 was a Monday.
 Thirty days has September,
 April, June and November.
 All the rest have thirty-one,
 Saving February alone,
 Which has twenty-eight, rain or shine.
 And on leap years, twenty-nine.
 A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 *
 * */

public class Problem19 {
    private boolean isDateSunday(Date inputDate){

        return false;
    }

    public static void main(String[] args) {
        int numberOfSundays = 0;
        Calendar startDate = Calendar.getInstance();
        startDate.set(1901, Calendar.JANUARY, 1);
        startDate.add(Calendar.DATE, 5);//set it to the next sunday

        Calendar endDate = Calendar.getInstance();
        endDate.set(2000, Calendar.DECEMBER, 31);

        while (startDate.before(endDate)){
            startDate.add(Calendar.DATE, 7);

            if(startDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
                if(startDate.get(Calendar.DATE) == 1){
                    System.out.println("Found Sunday: " + startDate.get(Calendar.MONTH) + " " + startDate.get(Calendar.DATE) + ", "  + startDate.get(Calendar.YEAR));
                    numberOfSundays++;
                }
            }
        }
        System.out.println("Number of Sunday 1s: " + numberOfSundays);
    }
}
