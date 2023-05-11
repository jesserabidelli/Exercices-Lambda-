package lambdaExercices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepeatedCharCounterTest {
    @Test
    public void testCountOccurences() {
        RepeatedCharCounter counter = new RepeatedCharCounter();
        String text = "la taille de la liste d'occurences";
        String word = "la";
        int expected = 2;
        int result = counter.countOccurrence(text,word);
        Assertions.assertEquals(expected, result);
    }
}
