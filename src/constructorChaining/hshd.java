package constructorChaining;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class hshd {

    public static void main(String[] args) {
        getMonthlyStats();
    }

    private static void getMonthlyStats() {
        Date today = new Date(System.currentTimeMillis());
        int numDays = -1;
        Date lastMonthDate = getDateFromToday(today, numDays);

       // return activityTrackerRepository.getActivityStatsByActivityDate(today, lastMonthDate);
    }

    private  static Date getDateFromToday(Date today, int numDays) {
        Calendar cal = new GregorianCalendar();
        cal.setTime(today);

        int n=Calendar.DAY_OF_MONTH;
        cal.add(Calendar.DAY_OF_WEEK, numDays);
        return new Date(cal.getTime().getTime());

    }


}
