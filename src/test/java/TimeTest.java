import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {
    private Time time;

    @Test
    public void testTime_timeString() {
        time = new Time(1, 30, 20);
        String t = time.timeString();
        Assertions.assertEquals(t, "01:30:20");
    }

    @Test
    public void testTime_normalisedTime() {
        time = new Time(1, 100, 0);
        String timeString = time.timeString();
        Assertions.assertEquals(timeString, "02:40:00");
    }

    @Test
    public void testTime_scaleChangeHour() {
        time = new Time(1, 59, 59);
        time.scale(1);
        Assertions.assertEquals(time.timeString(), "02:00:00");
    }

    @Test
    public void testTime_scaleChangeMinutes() {
        time = new Time(1, 30, 20);
        time.scale(400);
        Assertions.assertEquals(time.timeString(), "01:37:00");
    }

}
