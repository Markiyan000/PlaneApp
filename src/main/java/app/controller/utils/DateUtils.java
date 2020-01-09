package app.controller.utils;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateUtils {
    public static String getToday() {
        return LocalDate.now().getDayOfWeek().name();
    }

    public static String getTomorrow() {
        String today = getToday();
        int indexToday = 0;
        DayOfWeek[] dayOfWeeks = {DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY,
                DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY, DayOfWeek.SUNDAY};
        for (int i = 0; i < dayOfWeeks.length; i++) {
            if (today.equals(dayOfWeeks[i].name())) {
                indexToday = i;
                break;
            }
        }
        return dayOfWeeks[indexToday + 1].name();
    }
}
