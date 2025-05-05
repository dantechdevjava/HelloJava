package model;

import java.time.LocalDate;

public class UserDate {
    private int day;
    private int month;
    private int year;

    public UserDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public void addDays(int n){

        LocalDate localDate = LocalDate.of(getYear(), getMonth(), getDay());

        LocalDate updateDate = localDate.plusDays(n);

        setDay(updateDate.getDayOfMonth());
        setMonth(updateDate.getMonthValue());
        setYear(updateDate.getYear());

        System.out.println(this);
    }
}
