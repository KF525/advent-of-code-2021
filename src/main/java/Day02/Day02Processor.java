package Day02;

import io.vavr.collection.List;

public class Day02Processor {

    int partOne(List<String> directions) {
        int horizontal = 0;
        int depth = 0;

        for (String d : directions) {
            String[] dir = d.split(" ");
            int value = Integer.parseInt(dir[1]);
            String direction = dir[0];
            if (direction.equals("forward")) {
                horizontal = horizontal + value;
            } else if (direction.equals("down")) {
                depth = depth + value;
            } else {
                depth = depth - value;
            }
        }
        return horizontal * depth;
    }

    /**
     * down X increases your aim by X units.
     * up X decreases your aim by X units.
     * forward X does two things:
     * It increases your horizontal position by X units.
     * It increases your depth by your aim multiplied by X.
     */
    int partTwo(List<String> directions) {
        int horizontal = 0;
        int depth = 0;
        int aim = 0;

        for (String d : directions) {
            String[] dir = d.split(" ");
            int value = Integer.parseInt(dir[1]);
            String direction = dir[0];
            if (direction.equals("forward")) {
                horizontal = horizontal + value;
                depth = depth + (aim * value);
            } else if (direction.equals("down")) {
                aim = aim + value;
            } else {
                aim = aim - value;
            }
        }
        return horizontal * depth;
    }
}
