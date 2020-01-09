package app.controller.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {
    public static List<Integer> splitTime(String time) {
        String[] separated = time.split(":", 2);
        return Arrays.stream(separated).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
    }
}
