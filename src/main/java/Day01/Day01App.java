package Day01;

import util.FileUtil;

public class Day01App {

    public static void main(String[] args) {
        FileUtil.getResourceFile("input/day01.txt");
        Day01Processor processor = new Day01Processor();
        System.out.println(processor.partOne());
    }
}
