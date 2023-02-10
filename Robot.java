package trial;

public class Robot {
  private int x;
  private int y;
  private boolean penDown;
  private int[][] floor;
  private char direction;
  
  public Robot(int n) {
    x = 0;
    y = 0;
    penDown = false;
    floor = new int[n][n];
    direction = 'N';
  }
  
  public void setPenDown(boolean penDown) {
    this.penDown = penDown;
  }
  
  public void turnRight() {
    switch(direction) {
      case 'N':
        direction = 'E';
        break;
      case 'E':
        direction = 'S';
        break;
      case 'S':
        direction = 'W';
        break;
      case 'W':
        direction = 'N';
        break;
    }
  }
  
  public void turnLeft() {
    switch(direction) {
      case 'N':
        direction = 'W';
        break;
      case 'W':
        direction = 'S';
        break;
      case 'S':
        direction = 'E';
        break;
      case 'E':
        direction = 'N';
        break;
    }
  }
  
  public void move(int spaces) {
    switch(direction) {
      case 'N':
        y = y + spaces;
        break;
      case 'E':
        x = x + spaces;
        break;
      case 'S':
        y = y - spaces;
        break;
      case 'W':
        x = x - spaces;
        break;
    }
    if (penDown) {
      switch(direction) {
        case 'S':
          for (int i = y + spaces; i > y; i--) {
            floor[x][i] = 1;
          }
          break;
        case 'E':
          for (int i = x - spaces; i < x; i++) {
            floor[i][y] = 1;
          }
          break;
        case 'N':
          for (int i = y - spaces; i < y; i++) {
            floor[x][i] = 1;
          }
          break;
        case 'W':
          for (int i = x + spaces; i > x; i--) {
            floor[i][y] = 1;
          }
          break;
      }
    }
  }
  
  public void printPosition() {
    System.out.println("Position: " + x + ", " + y + " - Pen: " + (penDown ? "down" : "up") + " - Facing: " + direction);
  }
  
  public void printFloor() {
    for (int i = floor.length - 1; i >= 0; i--) {
      for (int j = 0; j < floor[0].length; j++) {
        System.out.print(floor[j][i] == 1 ? "* " : "  ");
      }
      System.out.println();
    }
  }
}

