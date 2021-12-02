package Day02;

import Day01.Day01Processor;
import io.vavr.collection.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day02ProcessorTest {

    @Test
    @DisplayName("day 02 part one does the thing")
    void day02PartOneDoesTheThing() {
        Day02Processor problem = new Day02Processor();
        List<String> directions = List.of("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2");
        assertEquals(150, problem.partOne(directions));
    }

    @Test
    @DisplayName("day 02 part two does the thing")
    void day02PartTwoDoesTheThing() {
        Day02Processor problem = new Day02Processor();
        List<String> directions = List.of("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2");
        assertEquals(900, problem.partTwo(directions));
    }



}