package org.robockets.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class RobotMap {
	public static Spark frontLeftMotorController = new Spark(8);
	public static Victor backLeftMotorController = new Victor(1);
	public static Victor frontRightMotorController = new Victor(6);
	public static Victor backRightMotorController = new Victor(4);

	public static Victor shooterFront = new Victor(0);
	public static Victor shooterBack = new Victor(2);

	public static Solenoid shooterPusher = new Solenoid(0);
	public static DoubleSolenoid heightSolenoid = new DoubleSolenoid(1,2);

	public static RobotDrive robotDrive = new RobotDrive(frontLeftMotorController,backLeftMotorController,frontRightMotorController,backRightMotorController);

}
