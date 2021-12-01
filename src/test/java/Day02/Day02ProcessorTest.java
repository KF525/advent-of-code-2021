package Day02;

import Day01.Day01Processor;
import io.vavr.collection.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day02ProcessorTest {

    @Test
    @DisplayName("day 02 part one does the thing")
    void day01PartOneDoesTheThing() {
        Day02Processor problem = new Day02Processor();
        //List<Integer> depths = List.of(199, 200, 208, 210, 200, 207, 240, 269, 260, 263);
        assertEquals(1, problem.partOne());
    }
}