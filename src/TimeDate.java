import java.time.*;

public class TimeDate {

    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2023,3,17);
        LocalDate ld3 = LocalDate.of(2020, Month.JANUARY,15);

        LocalDate invalidDate = LocalDate.of(2021,5,5);

        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);
        //System.out.println(invalidDate);


        System.out.println("***************************************");


        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(10,5);
        LocalTime lt3 = LocalTime.of(21,5,50);

        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt3);

        System.out.println("***************************************");

        LocalDateTime ldt1 = LocalDateTime.now();

        LocalDateTime ldt2 = LocalDateTime.of(2016,5,7,10,5);

        LocalDateTime ldt3 = LocalDateTime.of(ld1,lt1);

        System.out.println("***********local date time****************");

        System.out.println(ldt1);

        System.out.println(ldt2);

        System.out.println(ldt3);


        //Monthday

        System.out.println("*********** Month day ****************");

        MonthDay monthDay = MonthDay.of(10,15);
        LocalDate newLocalDate = monthDay.atYear(2023);

        System.out.println(newLocalDate);

        System.out.println("*********** Year Month ****************");

        YearMonth yearMonth = YearMonth.of(2016,4);
        LocalDate yearMonthDate = yearMonth.atDay(8);

        System.out.println(yearMonthDate);

    }
}
