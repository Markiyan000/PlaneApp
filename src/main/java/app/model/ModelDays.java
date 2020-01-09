package app.model;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.List;

public class ModelDays {
    private static List<DayOfWeek> days = Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY,
            DayOfWeek.FRIDAY, DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);

    public static List<DayOfWeek> getDays() {
        return days;
    }
}
