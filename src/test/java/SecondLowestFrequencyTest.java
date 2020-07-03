import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SecondLowestFrequencyTest {
    SecondLowestFrequency secondLowestFrequency;

    @BeforeEach
    public void init() {
        secondLowestFrequency = new SecondLowestFrequency();
    }

    @Test
    public void secondLowest_multipleFrequencies() {
        int freq = secondLowestFrequency.secondLowest(new int[]{4, 3, 1, 1, 2});
        Assertions.assertEquals(1, freq);
    }

    @Test
    public void secondLowest_multipleFreqSecondSmallestElement() {
        int freq = secondLowestFrequency.secondLowest(new int[]{4, 3, 1, 1, 2, 2});
        Assertions.assertEquals(2, freq);
    }

    @Test
    public void secondLowest_singleFreqSecondSmallestElement() {
        int freq = secondLowestFrequency.secondLowest(new int[]{4, 3, 1, 2});
        Assertions.assertEquals(2, freq);
    }
}
