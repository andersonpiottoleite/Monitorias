package time;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TesteTime {

    public static void main(String[] args) {
        var formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate parse = LocalDate.parse("05/12/2022", formater);
        System.out.println(parse);

        LocalDate last=LocalDate.of ( 2015, Month.DECEMBER, 1);
        LocalDate now= LocalDate.of ( 2017, Month.DECEMBER, 1);
        java.time.Period period=java.time.Period.between ( last, now);
        System.out.println ( period.toTotalMonths());
        System.out.println ( period.getMonths());
        System.out.println ( period.getYears());
        System.out.println ( period.getDays());

        System.out.println(ZoneId.systemDefault());
    }

}
