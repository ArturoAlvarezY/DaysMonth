package dev.arturo.models;

public  abstract class Months {
    String monthName;
    Integer days;

    public Months(String monthName, Integer days) {
        this.monthName = monthName;
        this.days = days;
    }

    public String getMonthName() {
        return monthName;
    }
    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public Integer getDays() {
        return days;
    }
    public void setDays(Integer days) {
        this.days = days;
    }
    
    public abstract void obtainMonth(int monthNumber);


    
}
