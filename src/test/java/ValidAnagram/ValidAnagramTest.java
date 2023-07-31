package ValidAnagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidAnagramTest {

    @Test
    void validAnagramTest() {
        //given
        String s1 = "anagram";
        String t1 = "nagaram";
        String s2 = "madagaskar";
        String t2 = "radagaskam";
        String s3 = "gherfeas";
        String t3 = "gkortkds";
        //when

        boolean result1 = ValidAnagram.validAnagramSolution(s1, t1);
        boolean result2 = ValidAnagram.validAnagramSolution(s2, t2);
        boolean result3 = ValidAnagram.validAnagramSolution(s3, t3);

        //then
        assertAll(
                () -> assertTrue(result1),
                () -> assertTrue(result2),
                () -> assertFalse(result3)
        );
    }
}
