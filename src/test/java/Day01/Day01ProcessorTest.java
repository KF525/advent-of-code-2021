package Day01;

import io.vavr.collection.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day01ProcessorTest {

    @Test
    @DisplayName("day 01 does the thing")
    void day01DoesTheThing() {
        Day01Processor problem = new Day01Processor();
        List<Integer> depths = List.of(199, 200, 208, 210, 200, 207, 240, 269, 260, 263);
        assertEquals(7, problem.partOne(depths));
    }

    @Test
    @DisplayName("day 02 does the thing")
    void day02DoesTheThing() {
        Day01Processor problem = new Day01Processor();
        List<Integer> depths = List.of(199, 200, 208, 210, 200, 207, 240, 269, 260, 263);
        assertEquals(5, problem.partTwo(depths));
    }


}