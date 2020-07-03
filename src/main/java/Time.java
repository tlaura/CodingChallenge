import lombok.Getter;

@Getter
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        normaliseTime();
    }

    public void normaliseTime() {
        if (seconds > 59) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        }
        if (minutes > 59) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
        if (hours > 23) {
            hours %= 24;
        }
    }

    public String timeString() {
        return timeConvert(hours) + ":" + timeConvert(minutes) + ":" + timeConvert(seconds);
    }

    private String timeConvert(int timeVal) {
        return timeVal < 9 ? "0" + timeVal : "" + timeVal;
    }

    public void scale(int additionalSecs) {
        seconds += additionalSecs;
        normaliseTime();
    }
}
