package Day01;

import io.vavr.collection.List;
import util.FileUtil;
import java.io.File;

public class Day01App {

    public static void main(String[] args) {
        File file = FileUtil.getResourceFile("input/day01.txt");
        List<Integer> integers = FileUtil.fileToList(file);
        Day01Processor day01 = new Day01Processor();
        System.out.println(day01.partOne(integers));
        System.out.println(day01.partTwo(integers));
    }
}
