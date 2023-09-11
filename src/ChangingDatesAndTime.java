import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class ChangingDatesAndTime {
    public static void main(String[] args) {

        LocalDateTime ldt1 = LocalDateTime.now();

        LocalDateTime ldt2 =  ldt1.plusDays(5);
        System.out.println(ldt2);

        LocalDateTime  ldt2a =ldt1.plus(Period.ofWeeks(1));
        System.out.println(ldt2a);

        LocalDateTime ldt3 =  ldt1.withMonth(4);
        System.out.println(ldt3);

        LocalDateTime ldt1b = ldt1.minus(Duration.ofHours(5));
        System.out.println(ldt1b);

        LocalDateTime ldt4 =ldt1.withMonth(5);
        System.out.println(ldt4);



    }
}
