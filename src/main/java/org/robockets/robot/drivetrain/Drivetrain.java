package org.robockets.robot.drivetrain;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.robockets.robot.RobotMap;

public class Drivetrain extends Subsystem {


	public void initDefaultCommand() {

	}

	public void driveArcade(double leftValue, double rightValue) {
		RobotMap.robotDrive.arcadeDrive(-leftValue, rightValue);
	}

	public void stop() {
		driveArcade(0, 0);
	}
}
