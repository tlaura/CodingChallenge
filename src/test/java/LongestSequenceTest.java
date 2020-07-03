import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LongestSequenceTest {
    private LongestSequence longestSequence;

    @BeforeEach
    public void init() {
        longestSequence = new LongestSequence();
    }

    @Test
    public void testlongestSeq_character() {
        LongestSequence.Tuple tuple = longestSequence.longestSequence("dghhhmhmx");
        Assertions.assertEquals('h', tuple.getCharacter());

    }

    @Test
    public void testlongestSeq_length() {
        LongestSequence.Tuple tuple = longestSequence.longestSequence("dghhhmhmx");
        Assertions.assertEquals(3, tuple.getLength());
    }

    @Test
    public void testlongestSeq_capitalLetterChar() {
        LongestSequence.Tuple tuple = longestSequence.longestSequence("dhkkhhKKKt");
        Assertions.assertEquals('k', tuple.getCharacter());
    }

    @Test
    public void testlongestSeq_capitalLetterLength() {
        LongestSequence.Tuple tuple = longestSequence.longestSequence("dhkkhhKKKt");
        Assertions.assertEquals(3, tuple.getLength());
    }

    @Test
    public void testLongestSeq_firstAlphabeticalChar() {
        LongestSequence.Tuple tuple = longestSequence.longestSequence("aBbBadddadd");
        Assertions.assertEquals('b', tuple.getCharacter());
    }

}
