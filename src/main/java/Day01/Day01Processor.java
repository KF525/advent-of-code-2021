package Day01;

import io.vavr.collection.List;

public class Day01Processor {

    int partOne(List<Integer> depths) {
        int count = 0;
        for (int i=1; i < depths.size(); i++) {
            if (depths.get(i) > depths.get(i - 1)) {
                count++;
            }
        }
        return count;
    }

    int partTwo(List<Integer> depths) {
        int count = 0;
        for (int i=3; i < depths.size(); i++) {
            if (depths.get(i - 3) < depths.get(i)) {
                count++;
            }
        }
        return count;
    }
}
