//Here is a unit test case for the move method:
import org.junit.Test;
import static org.junit.Assert.*;

public class RobotTest {
  
  @Test
  public void testMove_WhenFacingNorth() {
    // arrange
    Robot.direction = 'N';
    int spaces = 2;
    int xBefore = Robot.x;
    int yBefore = Robot.y;
    
    // act
    Robot.move(spaces);
    
    // assert
    assertEquals(xBefore, Robot.x);
    assertEquals(yBefore + spaces, Robot.y);
  }
  
  @Test
  public void testMove_WhenFacingEast() {
    // arrange
    Robot.direction = 'E';
    int spaces = 2;
    int xBefore = Robot.x;
    int yBefore = Robot.y;
    
    // act
    Robot.move(spaces);
    
    // assert
    assertEquals(xBefore + spaces, Robot.x);
    assertEquals(yBefore, Robot.y);
  }
  
  @Test
  public void testMove_WhenFacingSouth() {
    // arrange
    Robot.direction = 'S';
    int spaces = 2;
    int xBefore = Robot.x;
    int yBefore = Robot.y;
    
    // act
    Robot.move(spaces);
    
    // assert
    assertEquals(xBefore, Robot.x);
    assertEquals(yBefore - spaces, Robot.y);
  }
  
  @Test
  public void testMove_WhenFacingWest() {
    // arrange
    Robot.direction = 'W';
    int spaces = 2;
    int xBefore = Robot.x;
    int yBefore = Robot.y;
    
    // act
    Robot.move(spaces);
    
    // assert
    assertEquals(xBefore - spaces, Robot.x);
    assertEquals(yBefore, Robot.y);
  }
  
  @Test
  public void testMove_WhenPenIsDown() {
    // arrange
    Robot.direction = 'N';
    Robot.penDown = true;
    int spaces = 2;
    int xBefore = Robot.x;
    int yBefore = Robot.y;
    
    // act
    Robot.move(spaces);
    
    // assert
    assertEquals(xBefore, Robot.x);
    assertEquals(yBefore + spaces, Robot.y);
    for (int i = yBefore; i < yBefore + spaces; i++) {
      assertEquals(1, Robot.floor[xBefore][i]);
    }
  }
  
  @Test
  public void testMove_WhenPenIsUp() {
    // arrange
    Robot.direction = 'N';
    Robot.penDown = false;
    int spaces = 2;
    int xBefore = Robot.x;
    int yBefore = Robot.y;
    
    // act
    Robot.move(spaces);
    
    // assert
    assertEquals(xBefore, Robot.x);
    assertEquals(yBefore + spaces, Robot.y);
