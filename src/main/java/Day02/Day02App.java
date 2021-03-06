package Day02;

import io.vavr.collection.List;
import util.FileUtil;
import java.io.File;

public class Day02App {

    public static void main(String[] args) {
        File file = FileUtil.getResourceFile("input/day02.txt");
        List<String> input = FileUtil.fileToStringList(file);
        Day02Processor day02 = new Day02Processor();
        System.out.println(day02.partOne(input));
        System.out.println(day02.partTwo(input));
    }
}
