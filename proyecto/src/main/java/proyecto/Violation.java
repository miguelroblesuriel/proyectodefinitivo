package proyecto;

import java.time.LocalDate;

public class Violation {
    private String code;
    private LocalDate date;
    private String type;
    private int speedlimit;
    private int actualspeed;

    public Violation(String code, LocalDate date, String type) {
        this.code = code;
        this.date = date;
        this.type = type;
    }

    public Violation(String code, LocalDate date, String type, int speedlimit, int actualspeed) {
        this.code = code;
        this.date = date;
        this.type = type;
        this.speedlimit = speedlimit;
        this.actualspeed = actualspeed;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeedlimit(int speedlimit) {
        this.speedlimit = speedlimit;
    }

    public void setActualspeed(int actualspeed) {
        this.actualspeed = actualspeed;
    }

    public String getCode() {
        return this.code;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public String getType() {
        return this.type;
    }

    public int getSpeedlimit() {
        return this.speedlimit;
    }

    public int getActualspeed() {
        return this.actualspeed;
    }
}