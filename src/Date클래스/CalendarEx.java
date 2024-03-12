package Date클래스;

import java.sql.SQLOutput;
import java.util.Calendar;

public class CalendarEx {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int mon = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

    }
}
