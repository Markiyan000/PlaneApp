package app.controller.utils;

import app.model.entities.Plane;
import app.model.entities.Route;

import javax.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlaneUtils {
    public static Plane createPlane(HttpServletRequest request) {
        final String[] DAYS = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Long id = Long.parseLong(request.getParameter("id"));
        String company = request.getParameter("company");
        String[] daysOfExecution = {request.getParameter("mon"), request.getParameter("tue"),
                request.getParameter("wed"), request.getParameter("thu"),
                request.getParameter("fri"), request.getParameter("sat"), request.getParameter("sun")};
        List<String> realDayOfExecution = new ArrayList<>();
        for (int i = 0; i < daysOfExecution.length; i++) {
            if (daysOfExecution[i].equals("+")) realDayOfExecution.add(DAYS[i]);
        }
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        String timeStart = request.getParameter("departure");
        String timeFinish = request.getParameter("arrival");
        return new Plane(id, company, realDayOfExecution, new Route(from, to, timeStart, timeFinish));
    }

    public static void addPlane(List<Plane> planes, Plane plane) {
        planes.add(plane);
    }
}
