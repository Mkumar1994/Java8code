import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Durations {

    public static void main(String[] args) {

        Duration d1 = Duration.of(1, ChronoUnit.DAYS);
        System.out.println(d1);

        Duration d2 = Duration.ofHours(10);
        System.out.println(d2);

        Duration d3 = Duration.ofDays(15);
        System.out.println(d3);

        LocalTime lt   = LocalTime.now();
        LocalTime lt1  = LocalTime.of(10,35);
        Duration  du   = Duration.between(lt,lt1);
        System.out.println(du);



    }
}
