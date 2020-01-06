package app.controller.utils;

public class StringUtils {
    public static int[] splitTime(String time) {
        int[] res = new int[2];
        String[] separated = time.split(":", 2);
        for (int i = 0; i < 2; i++) {
            res[i] = Integer.parseInt(separated[i]);
        }
        return res;
    }
}
