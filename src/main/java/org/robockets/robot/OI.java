package org.robockets.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.robockets.robot.shooter.Fire;
import org.robockets.robot.shooter.Height;
import org.robockets.robot.shooter.SetHeight;
import org.robockets.robot.shooter.SpinSpinners;

public class OI {
	public static Joystick joystick = new Joystick(0);

	public static Button aButton = new JoystickButton(joystick, 0);
	public static Button bButton = new JoystickButton(joystick, 1);
	public static Button yButton = new JoystickButton(joystick, 3);

	public static Button leftBumper = new JoystickButton(joystick, 4);
	public static Button rightBumper = new JoystickButton(joystick, 5);

	public OI() {
		aButton.whenPressed(new SetHeight(Height.BOTTOM));
		bButton.whenPressed(new SetHeight(Height.LOW));
		yButton.whenPressed(new SetHeight(Height.HIGH));

		leftBumper.whileHeld(new SpinSpinners(1));
		rightBumper.whenPressed(new Fire());
	}
}
