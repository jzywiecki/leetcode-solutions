package ContainsDuplicate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ContainsDuplicateSolution {

    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for (int i: nums){
            set.add(i);
        }

        return set.size() < nums.length;
    }
}

