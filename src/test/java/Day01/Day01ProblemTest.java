package Day01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day01ProblemTest {

    @Test
    @DisplayName("day 01 does the thing")
    void day01DoesTheThing() {
        Day01Processor problem = new Day01Processor();
        assertEquals(1, problem.partOne());
    }

}