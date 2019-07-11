package pl.pfranczak;
import java.awt.AWTException;
import java.awt.Robot;

public class RobotMouseMove {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot robot = new Robot();
		while(true) {
			robot.mouseMove(0, 0);
			Thread.sleep(10000);
			robot.mouseMove(10, 10);
			Thread.sleep(10000);
		}
	}

}
