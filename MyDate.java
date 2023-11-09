import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    // No-arg constructor for the current date
    public MyDate() {
        GregorianCalendar currentDate = new GregorianCalendar();
        year = currentDate.get(Calendar.YEAR);
        month = currentDate.get(Calendar.MONTH);
        day = currentDate.get(Calendar.DAY_OF_MONTH);
    }

    // Constructor with elapsed time since January 1st, 1970
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // Constructor with specified year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter for the year
    public int getYear() {
        return year;
    }

    // Getter for the month
    public int getMonth() {
        return month;
    }

    // Getter for the day
    public int getDay() {
        return day;
    }

    // Set a new date for the object using the elapsed time
    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
    }
}

// Test program with provided dates in separate file: TestMyDate.java
