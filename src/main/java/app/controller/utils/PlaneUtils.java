package app.controller.utils;

import app.model.ModelDays;
import app.model.entities.Plane;
import app.model.entities.Route;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlaneUtils {
    public static Plane createPlane(HttpServletRequest request) {
        List<DayOfWeek> dayOfWeeks = ModelDays.getDays();
        Long id = Long.parseLong(request.getParameter("id"));
        String company = request.getParameter("company");
        String[] daysOfExecution = {request.getParameter("mon"), request.getParameter("tue"),
                request.getParameter("wed"), request.getParameter("thu"),
                request.getParameter("fri"), request.getParameter("sat"), request.getParameter("sun")};
        List<DayOfWeek> realDayOfExecution = new ArrayList<>();
        for (int i = 0; i < daysOfExecution.length; i++) {
            if (daysOfExecution[i].equals("+")) realDayOfExecution.add(dayOfWeeks.get(i));
        }
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        String timeStart = request.getParameter("departure");
        String timeFinish = request.getParameter("arrival");
        return new Plane(id, company, realDayOfExecution, new Route(from, to, timeStart, timeFinish));
    }

    public static Plane searchPlane(List<Plane> planes, Long ID) {
        return planes.stream().filter(p -> p.getId().equals(ID)).findFirst().get();
    }

    public static List<Plane> sortByTime(List<Plane> planes) {
        List<Plane> sorted = planes.stream().collect(Collectors.toList());
        sorted.sort((o1, o2) -> {
            Route first = o1.getRoute();
            Route second = o2.getRoute();
            if (first.remainingHour() == second.remainingHour())
                return first.remainingMinute() - second.remainingMinute();
            else return first.remainingHour() - second.remainingHour();
        });
        return sorted;
    }

    public static List<Plane> searchDeparture(List<Plane> planes, String city) {
        return planes.stream().filter(p -> p.getRoute().getFrom().equals(city)).collect(Collectors.toList());
    }

    public static List<Plane> searchArrival(List<Plane> planes, String city) {
        return planes.stream().filter(p -> p.getRoute().getTo().equals(city)).collect(Collectors.toList());
    }

    public static List<Plane> searchFlightByDay(List<Plane> planes, String day) {
        List<Plane> found = new ArrayList<>();
        for (Plane plane : planes) {
            List<DayOfWeek> dayOfWeeks = plane.getDaysOfExecution();
            for (DayOfWeek dayOfWeek : dayOfWeeks) {
                if (dayOfWeek.name().equalsIgnoreCase(day)) {
                    found.add(plane);
                    break;
                }
            }
        }
        return found;
    }

    public static void readFromFile(List<Plane> planes) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\marki\\IdeaProjects\\PlaneApp\\source_data.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            while (true) {
                Plane plane;
                while ((plane = (Plane) objectInputStream.readObject()) != null) {
                    planes.add(plane);
                }
            }
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        } catch (EOFException exception) {
            exception.printStackTrace();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
