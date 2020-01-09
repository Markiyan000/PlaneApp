package app.model.entities;

import app.controller.utils.StringUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Route implements Serializable {
    private static final long serialVersionUID = 1L;
    private String from;
    private String to;
    private String timeStart;
    private String timeFinish;

    public Route() {
    }

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

    public Integer getHourStart() {
        List<Integer> time = StringUtils.splitTime(timeStart);
        return time.get(0);
    }

    public Integer getMinuteStart() {
        List<Integer> time = StringUtils.splitTime(timeStart);
        return time.get(1);
    }

    public static Integer getCurHour() {
        return new Date().getHours();
    }

    public static Integer getCurMinute() {
        return new Date().getMinutes();
    }

    public Integer remainingHour() {
        int hourStart = getHourStart();
        int curHour = getCurHour();
        if (hourStart >= curHour) {
            return hourStart - curHour;
        } else return (24 + hourStart) - curHour;
    }

    public Integer remainingMinute() {
        return getMinuteStart() - getCurMinute();
    }
}
