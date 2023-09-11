import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ConvertingDates {
    public static void main(String[] args) {
        Date date = new Date(2022,5,15);
        LocalDateTime ldt =  date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(ldt);

        Calendar cal =  Calendar.getInstance();
        LocalDateTime ldt2 = cal.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(ldt2);

    }
}
