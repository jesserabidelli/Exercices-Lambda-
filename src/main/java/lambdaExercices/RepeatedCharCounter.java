package lambdaExercices;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RepeatedCharCounter {
    public int countOccurrence(String text, String word){
        List<String> textWords = Arrays.asList(text.split(" "));

        Predicate<String> checkWord = w -> w.equals(word);
        List<String> occurrences = textWords.stream().filter(checkWord).toList();

        return occurrences.size();
    }
}
