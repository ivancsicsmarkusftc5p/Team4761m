package org.robockets.robot.shooter;

import edu.wpi.first.wpilibj.DoubleSolenoid;
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
		System.out.println("Set height to: " + height.toString());
		switch (height) {
			case BOTTOM:
				RobotMap.heightSolenoid.set(DoubleSolenoid.Value.kOff);
				break;
			case LOW:
				RobotMap.heightSolenoid.set(DoubleSolenoid.Value.kReverse);
				break;
			case HIGH:
				RobotMap.heightSolenoid.set(DoubleSolenoid.Value.kForward);
				break;
			default:
				RobotMap.heightSolenoid.set(DoubleSolenoid.Value.kOff);
		}
	}

}
