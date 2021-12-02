package Day01;

import io.vavr.collection.List;
import io.vavr.collection.Stream;

public class Day01Processor {

    int partOne(List<Integer> input) {
        return Stream.range(1, input.size())
                .count(i -> input.get(i) > input.get(i - 1));
    }

    int partTwo(List<Integer> input) {
        return Stream.range(3, input.size())
                .count(i -> input.get(i) > input.get(i - 3));
    }
}
