package training.localization;

import java.time.*;

public class ZoneExample {
    public static void main(String[] args) {
        ZoneId katmandu = ZoneId.of("Asia/Katmandu");
        ZoneId london = ZoneId.of("Europe/London");

        LocalTime teaTime = LocalTime.of(17,30);
        LocalDate today = LocalDate.now();
        LocalDateTime tomorrowTeaTime = LocalDateTime.of(today.plusDays(1),teaTime);
        LocalDateTime todayLocale = LocalDateTime.now();
        ZonedDateTime londonTime = ZonedDateTime.of(tomorrowTeaTime,london);
        ZonedDateTime katmanduTime = ZonedDateTime.of(tomorrowTeaTime,katmandu);
        System.out.println("londonTime:" + londonTime);
        System.out.println("now       :" + todayLocale);
        System.out.println("offSet    :" + londonTime.getOffset());
        System.out.println("offSet    :" + katmanduTime.getOffset());

    }
}
