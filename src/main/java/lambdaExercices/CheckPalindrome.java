package lambdaExercices;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class CheckPalindrome {

    public boolean isWordPalindrome(String word){
        IntPredicate isEqual = i -> word.charAt(i) == word.charAt(word.length() - i - 1);

        return IntStream.range(0, word.length() / 2)
                .allMatch(isEqual);
    }
}
