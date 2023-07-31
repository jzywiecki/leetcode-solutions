package TwoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumTest {

    @Test
    void TwoSumTest(){
        //given
        int[] nums1 = new int[]{3, 2, 4};
        int[] nums2 = new int[]{3, 2, 4};
        int[] nums3 = new int[]{3, 2, 4};
        //when

        int[] result1 = TwoSumSolution.twoSumSolution(nums1, 6);
        int[] result2 = TwoSumSolution.twoSumSolution(nums1, 6);
        int[] result3 = TwoSumSolution.twoSumSolution(nums1, 6);
        //then
        assertArrayEquals(new int[]{1, 2}, result1);
        assertArrayEquals(new int[]{1, 2}, result1);
        assertArrayEquals(new int[]{1, 2}, result1);

    }
}
