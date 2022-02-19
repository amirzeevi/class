package oop.clock;

public class Clock {
    public final int MAX_HOURS = 24;
    public final int MAX_MIN = 60;
    private int hour;
    private int minutes;
    private static int format = 24;

    public Clock(int hour, int minutes, int format) {
        this.hour = hour;
        this.minutes = minutes;
    }

    public Clock(Clock other) {
        this(other.hour, other.minutes, format);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (this.hour + hour > MAX_HOURS) {
            this.hour += hour % 24;
        } else {
            this.hour += hour;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public static void setFormat(boolean is24) {
        format = is24 ? 24 : 12;
    }

    public void setMinutes(int minutes) {
        if (this.minutes + minutes > MAX_MIN) {
            this.minutes += minutes % 60;
        } else {
            this.minutes += minutes;
        }
    }

    public int getMAX_HOURS() {
        return MAX_HOURS;
    }

    public int getMAX_MIN() {
        return MAX_MIN;
    }

    @Override
    public String toString() {
        if (format == 24) {
            return hour + ":" + minutes + "0" + minutes;
        }
        return hour % 12 + ":" + minutes;
    }
}
