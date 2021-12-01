package Day01;

import io.vavr.collection.List;

public class Day01Processor {

    int partOne(List<Integer> depths) {
        int count = 0;
        for (int i=1; i < depths.size(); i++) {
            if (depths.get(i) > depths.get(i - 1)) {
                count = count + 1;
            }
        }
        return count;
    }

    int partTwo(List<Integer> depths) {
        int count = 0;
        for (int i=3; i < depths.size(); i++) {
            int a = depths.get(i - 3);
            int b = depths.get(i);
            if (a < b) {
                count = count + 1;
            }
        }
        return count;
    }
}
