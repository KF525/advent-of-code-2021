package Day02;

import Day01.Day01Processor;
import io.vavr.collection.List;
import util.FileUtil;
import java.io.File;

public class Day02App {

    public void main(String[] args) {
        File file = FileUtil.getResourceFile("input/day02.txt");
        List<Integer> depths = FileUtil.fileToList(file);
        Day02Processor day02 = new Day02Processor();
        System.out.println(day02.partOne());
    }
}
