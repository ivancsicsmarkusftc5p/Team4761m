package org.robockets.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import org.robockets.robot.drivetrain.Drivetrain;
import org.robockets.robot.drivetrain.Joyride;
import org.robockets.robot.shooter.Shooter;

public class Robot extends IterativeRobot {

	public static Drivetrain drivetrain;
	public static Shooter shooter;

	public static Command joyride;

	public static OI oi;

    @Override
    public void robotInit() {
    	drivetrain = new Drivetrain();
    	shooter = new Shooter();

    	joyride = new Joyride();


    	oi = new OI();
    }

    @Override
    public void disabledInit() { }

    @Override
    public void autonomousInit() { }

    @Override
    public void teleopInit() {
    	joyride.start();
    }

    @Override
    public void testInit() { }


    @Override
    public void disabledPeriodic() {
	    Scheduler.getInstance().run();
    }
    
    @Override
    public void autonomousPeriodic() {
	    Scheduler.getInstance().run();
    }

    @Override
    public void teleopPeriodic() {
	    Scheduler.getInstance().run();
    }

    @Override
    public void testPeriodic() { }
}