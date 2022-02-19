package oop;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean setHours(int h) {
        if (h < 0 || h > 23) {
            System.out.println("Hours values is between 0-23");
            return false;
        } else {
            hours = h;
            return true;
        }
    }

    public boolean setMinutes(int m) {
        if (m < 0 || m > 59) {
            System.out.println("Minutes values is between 0-59");
            return false;
        } else {
            minutes = m;
            return true;
        }
    }

    public boolean setSeconds(int s) {
        if (s < 0 || s > 59) {
            System.out.println("Seconds values is between 0-59");
            return false;
        } else {
            seconds = s;
            return true;
        }
    }

    public void tick(int n) {
        int tempSeconds = seconds + n;
        seconds = tempSeconds % 60;
        minutes += tempSeconds / 60;
        hours += minutes / 60;
        minutes %= 60;
    }

    public void show() {
        System.out.print(hours < 10 ? "0" + hours + ":" : hours + ":");
        System.out.print(minutes < 10 ? "0" + minutes + ":" : minutes + ":");
        System.out.println(seconds < 10 ? "0" + seconds : seconds);
    }

    public void setReset() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
}


