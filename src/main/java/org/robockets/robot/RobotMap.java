package org.robockets.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class RobotMap {
	public static Victor leftMotorController = new Victor(0);
	public static Victor rightMotorController = new Victor(1);

	public static Victor shooterFront = new Victor(2);
	public static Victor shooterBack = new Victor(3);

	public static Solenoid shooterPusher = new Solenoid(0);
	public static DoubleSolenoid heightSolenoid = new DoubleSolenoid(1,2);

	public static DifferentialDrive robotDrive = new DifferentialDrive(leftMotorController, rightMotorController);
}
