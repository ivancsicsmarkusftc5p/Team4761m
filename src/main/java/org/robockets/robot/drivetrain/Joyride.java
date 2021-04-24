package org.robockets.robot.drivetrain;

import edu.wpi.first.wpilibj.command.Command;
import org.robockets.robot.OI;
import org.robockets.robot.Robot;

public class Joyride extends Command {

	double translate;
	double rotate;

	public Joyride() {
		requires(Robot.drivetrain);
	}

	protected void initialize() {
	}

	protected void execute() {
		translate = OI.joystick.getRawAxis(1);
		rotate = OI.joystick.getRawAxis(4);

		Robot.drivetrain.driveArcade(translate, -rotate);
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.drivetrain.stop();
	}

	protected void interrupted() {
		end();
	}
}
