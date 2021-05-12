package stream.BlackFriday;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DateUtil {
    public static void printBlackFridaySorted(int startYear, int endYear) {


        LocalDate startDate = LocalDate.of(startYear, 1, 1);
        LocalDate endDate = LocalDate.of(endYear, 1, 1);
        long days = ChronoUnit.DAYS.between(startDate, endDate);

        List<Map.Entry<Integer, Long>> blackFridays
                = Stream.iterate(startDate, localDate -> localDate.plusDays(1))
                .limit(days)
                .filter(localDate -> localDate.getDayOfMonth() == 13)
                .filter(localDate -> localDate.getDayOfWeek().equals(DayOfWeek.FRIDAY))
                .collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()))
                .entrySet().stream()
                .sorted((d1, d2) -> (int) (d2.getValue() - d1.getValue()))
                .collect(Collectors.toList());

        System.out.println(blackFridays);


    }
}
