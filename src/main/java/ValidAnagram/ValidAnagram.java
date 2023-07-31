package ValidAnagram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.sort;

public class ValidAnagram {
    public static boolean validAnagramSolution(String s, String t){
        if (s.length() != t.length()){
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars= t.toCharArray();

        sort(sChars);
        sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
}
