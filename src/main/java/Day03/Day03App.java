package Day03;

import Day02.Day02Processor;
import io.vavr.collection.List;
import util.FileUtil;

import java.io.File;

public class Day03App {

    public static void main(String[] args) {
        File file = FileUtil.getResourceFile("input/day03.txt");
        List<String> input = FileUtil.fileToStringList(file);
        Day03Processor day03 = new Day03Processor();
        System.out.println(day03.partOne());;
    }
}
