package lambdaExercices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ConcatenateListsTest {
    @Test
        public void test() {
        ConcatenateLists concatenateLists = new ConcatenateLists();
        List<String> l1 = Arrays.asList("a", "b", "c");
        List<Integer> l2 = Arrays.asList(1, 2, 3);
        String[] result = concatenateLists.concat(l1, l2).toArray(new String[0]);
        String[] expected =  {"a", "b", "c", "1", "2", "3"};
        Assertions.assertArrayEquals(expected,result);
    }
}
