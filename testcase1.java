	import org.junit.Test;
	import static org.junit.Assert.*;

	public class RobotTest {
	    @Test
	    public void testSetPenDown() {
	        Robot robot = new Robot();

	        robot.setPenDown(true);
	        assertTrue(Robot.penDown);

	        robot.setPenDown(false);
	        assertFalse(Robot.penDown);
	    }
	}


