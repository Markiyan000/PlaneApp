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
        List<DayOfWeek> dayOfWeeks = ModelDays.getDays();
        DayOfWeek today = LocalDate.now().getDayOfWeek();
        int indexToday = dayOfWeeks.indexOf(today);
        return dayOfWeeks.get(indexToday + 1).name();
    }
}
