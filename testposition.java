import org.junit.Test;
import static org.junit.Assert.*;

public class RobotTest {
    @Test
    public void testGetPositionString() {
        Robot robot = new Robot();

        // Start at position (0, 0) facing North with pen up
        assertEquals("Position: 0, 0 - Pen: up - Facing: N", Robot.getPositionString());

        // Move to position (1, 2) facing East with pen down
        robot.x = 1;
        robot.y = 2;
        robot.direction = 'E';
        robot.penDown = true;
        assertEquals("Position: 1, 2 - Pen: down - Facing: E", Robot.getPositionString());
    }
}
