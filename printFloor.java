It's not recommended to write unit tests for methods that have output to the console, as that output can be hard to test programmatically. If you want to test the printFloor method, you can modify it to return the string that it would have printed instead of printing it to the console, and then write a test case that asserts the correctness of the returned string.

Here's an example of how you could modify the printFloor method:
public static String getFloorString() {
    StringBuilder sb = new StringBuilder();
    for (int i = floor.length - 1; i >= 0; i--) {
      for (int j = 0; j < floor[0].length; j++) {
        sb.append(floor[j][i] == 1 ? "* " : "  ");
      }
      sb.append("\n");
    }
    return sb.toString();
}
And here's an example of a JUnit test case for the getFloorString method:
import org.junit.Test;
import static org.junit.Assert.*;

public class RobotTest {
    @Test
    public void testGetFloorString() {
        Robot robot = new Robot();

        // Start with an empty floor
        int[][] floor = new int[][] {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        Robot.floor = floor;
        assertEquals("  \n  \n  \n", Robot.getFloorString());

        // Draw a cross on the floor
        floor = new int[][] {
            {0, 1, 0},
            {1, 1, 1},
            {0, 1, 0}
        };
        Robot.floor = floor;
        assertEquals("  *  \n *** \n  *  \n", Robot.getFloorString());
    }
}
