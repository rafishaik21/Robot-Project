package trial;

public class test {

	public static void main(String args[]) {
		Robot r = new Robot(10);
		r.setPenDown(true);
		r.printPosition();
		r.turnRight();
		r.printPosition();

		r.move(9);
		r.printPosition();

		r.turnLeft();
		r.printPosition();

		r.move(9);
		r.printPosition();
		r.printFloor();
	}


}
