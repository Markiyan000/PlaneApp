package app.model.entities;

import app.controller.utils.StringUtils;

import java.util.Date;

public class Route {
    private String from;
    private String to;
    private String timeStart;
    private String timeFinish;

    public Route(){}

    public Route(String from, String to, String timeStart, String timeFinish) {
        this.from = from;
        this.to = to;
        this.timeStart = timeStart;
        this.timeFinish = timeFinish;
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

    public String getTimeFinish() {
        return timeFinish;
    }

    public void setTimeFinish(String timeFinish) {
        this.timeFinish = timeFinish;
    }

    public int getHourStart() {
        int[] time = StringUtils.splitTime(timeStart);
        return time[0];
    }

    public int getMinuteStart() {
        int[] time = StringUtils.splitTime(timeStart);
        return time[1];
    }

    public static int getCurHour() {
        return new Date().getHours();
    }

    public static int getCurMinute() {
        return new Date().getMinutes();
    }

    public int remainingHour() {
        int hourStart = getHourStart();
        int curHour = getCurHour();
        if (hourStart >= curHour) {
            return hourStart - curHour;
        } else return (24 + hourStart) - curHour;
    }

    public int remainingMinute() {
        return getMinuteStart() - getCurMinute();
    }
}
