package app.model.entities;

import java.util.List;

public class Plane {
    private long id;
    private String company;
    private List<String> daysOfExecution;
    private Route route;

    public Plane(){

    }

    public Plane(long id, String company, List<String> daysOfExecution, Route route) {
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

    public List<String> getDaysOfExecution() {
        return daysOfExecution;
    }

    public void setDaysOfExecution(List<String> daysOfExecution) {
        this.daysOfExecution = daysOfExecution;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", daysOfExecution=" + daysOfExecution +
                ", route=" + route +
                '}';
    }
}