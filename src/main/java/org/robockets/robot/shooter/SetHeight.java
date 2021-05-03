package org.robockets.robot.shooter;

import edu.wpi.first.wpilibj.command.Command;
import org.robockets.robot.Robot;

public class SetHeight extends Command {

	private Height height;

	public SetHeight(Height height) {
		this.height = height;
	}

	protected void initialize() {
		System.out.println("Height set to " + height);
		Robot.shooter.setHeight(height);
	}

	protected void execute() {
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {
	}

	protected void interrupted() {
		end();
	}
}