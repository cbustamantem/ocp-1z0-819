package training.localization;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        //pattern
        // <weekday>, <day>  of <month> <year> at  <4Hours>:<Minutes> <Zone>
      Locale locale = Locale.UK;
      DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("EE', 'd', of 'MMMM yyyy' at 'HH:mm z",locale);
        LocalTime teaTime = LocalTime.of(17,30);
        LocalDate today = LocalDate.now();
        LocalDateTime tomorrowTeaTime = LocalDateTime.of(today.plusDays(1),teaTime);
        ZoneId katmandu = ZoneId.of("Asia/Katmandu");
        ZonedDateTime katmanduTime = ZonedDateTime.of(tomorrowTeaTime,katmandu);
        System.out.println(katmanduTime);

    }
}
