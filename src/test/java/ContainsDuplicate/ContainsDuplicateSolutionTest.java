package ContainsDuplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateSolutionTest {

    @Test
    void containsDuplicateTest() {
        //given
        int[] input1 = {1, 5, 3, 2, 6, 4, 2, 7, 5, 2, 1};
        boolean expectedOutput1 = true;
        int[] input2 = {9, 8, 2, 3, 5, 6, 4, 1, 1, 6, 4};
        boolean expectedOutput2 = true;
        int[] input3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean expectedOutput3 = false;

        //when
        boolean output1 = ContainsDuplicateSolution.containsDuplicate(input1);
        boolean output2 = ContainsDuplicateSolution.containsDuplicate(input2);
        boolean output3 = ContainsDuplicateSolution.containsDuplicate(input3);

        //then
        assertAll( () -> assertEquals(expectedOutput1, output1),
                   () -> assertEquals(expectedOutput2, output2),
                   () -> assertEquals(expectedOutput3, output3));

    }
}