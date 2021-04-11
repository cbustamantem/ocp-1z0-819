package training.localization;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExampleLocale {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.plusYears(1).getDayOfWeek());
        System.out.println(today);
        LocalTime teaTime = LocalTime.of(17,30);
        System.out.println(teaTime);
        LocalTime now = LocalTime.now();
        Duration timeGap =Duration.between(teaTime,now);
        System.out.println("TimeGap:" + timeGap);
        System.out.println("TimeGap.toDays:" + timeGap.toDays());
        System.out.println("TimeGap.toDaysPart:" + timeGap.toDaysPart());
        System.out.println("TimeGap.toHours:" + timeGap.toHours());
        System.out.println("TimeGap.toMinutes:" + timeGap.toMinutes());
        System.out.println(Duration.between(now,teaTime));
        LocalDateTime tomorrowTeaTime = LocalDateTime.of(today.plusDays(1),teaTime);
        System.out.println("TomorrowTeaTime :" +  tomorrowTeaTime);
        //
    }
}
