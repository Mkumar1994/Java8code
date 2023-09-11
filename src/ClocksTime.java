import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class ClocksTime {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);

        Instant instant = clock.instant();
        System.out.println(instant);

        Clock clck = Clock.systemUTC();
        System.out.println(clck.instant());


        Clock clck2 = Clock.offset(clock, Duration.ofHours(10));
        System.out.println(clck2.instant());

    }
}
