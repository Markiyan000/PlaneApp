package app.model.entities;

public class Route {
    private String from;
    private String to;
    private String timeStart;
    private String startFinish;

    public Route(){}

    public Route(String from, String to, String timeStart, String startFinish) {
        this.from = from;
        this.to = to;
        this.timeStart = timeStart;
        this.startFinish = startFinish;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getStartFinish() {
        return startFinish;
    }

    public void setStartFinish(String startFinish) {
        this.startFinish = startFinish;
    }

    @Override
    public String toString() {
        return "Route{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", timeStart='" + timeStart + '\'' +
                ", startFinish='" + startFinish + '\'' +
                '}';
    }
}
