package app.controller.utils;

import app.model.entities.Plane;
import app.model.entities.Route;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class PlaneUtils {
    public static Plane createPlane(HttpServletRequest request) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Long id = Long.parseLong(request.getParameter("id"));
        String company = request.getParameter("company");
        String[] daysOfExecution = {request.getParameter("mon"), request.getParameter("tue"),
                request.getParameter("wed"), request.getParameter("thu"),
                request.getParameter("fri"), request.getParameter("sat"), request.getParameter("sun")};
        List<String> realDayOfExecution = new ArrayList<>();
        for (int i = 0; i < daysOfExecution.length; i++) {
            if (daysOfExecution[i].equals("+")) realDayOfExecution.add(days[i]);
        }
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        String timeStart = request.getParameter("departure");
        String timeFinish = request.getParameter("arrival");
        return new Plane(id, company, realDayOfExecution, new Route(from, to, timeStart, timeFinish));
    }

    public static Plane searchPlane(List<Plane> planes, Long ID) {
        for (Plane plane : planes) {
            Long currentID = plane.getId();
            if (ID == currentID) return plane;
        }
        return null;
    }
}
