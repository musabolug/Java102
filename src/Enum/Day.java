package Enum;

public class Day {
    public static final Day MONDAY = new Day(1);
    public static final Day TUESDAY = new Day(2);
    public static final Day WEDNESDAY = new Day(3);
    public static final Day THURSDAY = new Day(4);
    public static final Day FRIDAY = new Day(5);
    public static final Day SATURDAY = new Day(6);
    public static final Day SUNDAY = new Day(7);
    private int day;

    private Day(int day){
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
