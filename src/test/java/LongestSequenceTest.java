import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Tuple;

public class LongestSequenceTest {
    private LongestSequence longestSequence;

    @BeforeEach
    public void init() {
        longestSequence = new LongestSequence();
    }

    @Test
    public void testLongestSeq_character() {
        Tuple tuple = longestSequence.longestSequence("dghhhmhmx");
        Assertions.assertEquals('h', tuple.getCharacter());

    }

    @Test
    public void testLongestSeq_length() {
        Tuple tuple = longestSequence.longestSequence("dghhhmhmx");
        Assertions.assertEquals(3, tuple.getLength());
    }

    @Test
    public void testLongestSeq_capitalLetterChar() {
        Tuple tuple = longestSequence.longestSequence("dhkkhhKKKt");
        Assertions.assertEquals('k', tuple.getCharacter());
    }

    @Test
    public void testLongestSeq_capitalLetterLength() {
        Tuple tuple = longestSequence.longestSequence("dhkkhhKKKt");
        Assertions.assertEquals(3, tuple.getLength());
    }

    @Test
    public void testLongestSeq_firstAlphabeticalChar() {
        Tuple tuple = longestSequence.longestSequence("aBbBadddadd");
        Assertions.assertEquals('b', tuple.getCharacter());
    }
}
