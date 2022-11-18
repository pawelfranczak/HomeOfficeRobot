package pl.pfranczak;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotMouseMove {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot robot = new Robot();
		while(true) {
			robot.keyPress(KeyEvent.VK_F13);
			Thread.sleep(10000);
		}
	}

}
