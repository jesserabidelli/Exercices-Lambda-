package lambdaExercices;
public class RepeatedCharFinder {
    public Character findSingleOccurence (String text){
        return text.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> text.indexOf(c) == text.lastIndexOf(c))
                .findFirst()
                .orElse('\u0000');

    }
}
