package app.model.entities;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.List;

public class Plane implements Serializable {
    private long id;
    private String company;
    private List<DayOfWeek> daysOfExecution;
    private Route route;

    public Plane() {

    }

    public Plane(long id, String company, List<DayOfWeek> daysOfExecution, Route route) {
        this.id = id;
        this.company = company;
        this.daysOfExecution = daysOfExecution;
        this.route = route;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<DayOfWeek> getDaysOfExecution() {
        return daysOfExecution;
    }

    public void setDaysOfExecution(List<DayOfWeek> daysOfExecution) {
        this.daysOfExecution = daysOfExecution;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}