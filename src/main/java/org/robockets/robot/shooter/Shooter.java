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

}