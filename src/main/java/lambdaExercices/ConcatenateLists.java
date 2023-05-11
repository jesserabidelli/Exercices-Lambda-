package lambdaExercices;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateLists {

    public List<String> concat(List<String> l1,List<Integer> l2){
        List<String> l2ToString = l2.stream().map(Object::toString).toList();
        return Stream.concat(l1.stream(),l2ToString.stream()).collect(Collectors.toList());
    }
}
