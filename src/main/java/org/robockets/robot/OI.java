package org.robockets.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.robockets.robot.pneumatics.ToggleCompressor;
import org.robockets.robot.shooter.Fire;
import org.robockets.robot.shooter.MoveDown;
import org.robockets.robot.shooter.MoveUp;
import org.robockets.robot.shooter.SpinSpinners;

public class OI {
	public static Joystick joystick = new Joystick(0);

	public static Button aButton = new JoystickButton(joystick, 1);
	public static Button bButton = new JoystickButton(joystick, 2);
	public static Button yButton = new JoystickButton(joystick, 4);

	public static Button leftBumper = new JoystickButton(joystick, 5);
	public static Button rightBumper = new JoystickButton(joystick, 6);

	public static Button startButton = new JoystickButton(joystick, 8);

	public OI() {
		aButton.whenPressed(new MoveUp());
		yButton.whenPressed(new MoveDown());

		leftBumper.whileHeld(new SpinSpinners(1));
		rightBumper.whenPressed(new Fire());

		startButton.whenPressed(new ToggleCompressor());
	}
}
