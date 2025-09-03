package Time_9;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalize();
    }

    public Time addTime(Time two) {
        int newHours = this.hours + two.hours;
        int newMinutes = this.minutes + two.minutes;
        int newSeconds = this.seconds + two.seconds;

        return new Time(newHours, newMinutes, newSeconds);
    }

    private void normalize() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        }

        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }

        hours = hours % 24;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {

        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "Time [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
    }

}
