import org.junit.Test;
//In this example, the test testTurnLeft uses the JUnit @Test annotation to indicate that it is a test case. The method creates an instance of the Robot class, sets the direction field to 'N', and then calls the turnLeft method four times. The JUnit assertEquals method is used to verify that the value of the direction field is set correctly after each call to turnLeft.

import static org.junit.Assert.*;

public class RobotTest {
    @Test
    public void testTurnLeft() {
        Robot robot = new Robot();

        // Start facing North
        robot.direction = 'N';
        Robot.turnLeft();
        assertEquals('W', robot.direction);

        Robot.turnLeft();
        assertEquals('S', robot.direction);

        Robot.turnLeft();
        assertEquals('E', robot.direction);

        Robot.turnLeft();
        assertEquals('N', robot.direction);
    }
}
