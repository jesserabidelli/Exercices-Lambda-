package lambdaExercices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleOccurenceTest {

    @Test
    public void testfindSingleOccurence(){
        RepeatedCharFinder repeatedCharFinder = new RepeatedCharFinder();
        String text1 = "stress";
        char exp1 = 't';

        char result1 = repeatedCharFinder.findSingleOccurence(text1);
        Assertions.assertEquals(exp1,result1);

        String text2 = "ovale";
        char exp2 = 'o';
        char result2 = repeatedCharFinder.findSingleOccurence(text2);
        Assertions.assertEquals(exp2,result2);
    }
}
