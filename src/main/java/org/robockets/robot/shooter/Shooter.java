package org.robockets.robot.shooter;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.robockets.robot.RobotMap;

public class Shooter extends Subsystem {


	public void initDefaultCommand() {
	}

	public void setSpinnerSpeed(double speed){
		RobotMap.shooterFront.set(speed);
		RobotMap.shooterBack.set(speed);
	}

	public void shoot() {
		RobotMap.shooterPusher.set(true);
	}

	public void release() {
		RobotMap.shooterPusher.set(false);
	}

	public void setHeight(Height height) {
		switch (height) {
			case BOTTOM:
				RobotMap.lowHeightSolenoid.set(false);
				RobotMap.highHeightSolenoid.set(false);
				break;
			case LOW:
				RobotMap.lowHeightSolenoid.set(true);
				RobotMap.highHeightSolenoid.set(false);
				break;
			case HIGH:
				RobotMap.lowHeightSolenoid.set(false);
				RobotMap.highHeightSolenoid.set(true);
				break;
			default:
				RobotMap.lowHeightSolenoid.set(false);
				RobotMap.highHeightSolenoid.set(false);
		}
	}

}