package app.controller.utils;

import app.model.ModelDays;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class DateUtils {
    public static String getToday() {
        return LocalDate.now().getDayOfWeek().name();
    }

    public static String getTomorrow() {
        String today = getToday();
        List<DayOfWeek> dayOfWeeks = ModelDays.getDays();
        DayOfWeek temporaryToday = dayOfWeeks.stream().filter(d -> d.name().equals(today)).findFirst().get();
        int indexToday = dayOfWeeks.indexOf(temporaryToday);
        return dayOfWeeks.get(indexToday + 1).name();
    }
}
