import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatDate {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();

        /*String formattedDate = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(ldt);
        System.out.println(formattedDate);*/

        String formattedDate1 = DateTimeFormatter.BASIC_ISO_DATE.format(ldt);
        System.out.println(formattedDate1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-YYYY");
        System.out.println(dtf.format(ldt));


        String formattedLocalDate = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(ldt);
        System.out.println(formattedLocalDate);



    }
}
//Datetimeformater.