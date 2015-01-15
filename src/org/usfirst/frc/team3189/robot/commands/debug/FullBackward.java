package org.usfirst.frc.team3189.robot.commands.debug;

import org.usfirst.frc.team3189.robot.Robot;
import org.usfirst.frc.team3189.robot.utility.ValueReference;

/**
 *
 */
public class FullBackward extends FullForward {
	
	public FullBackward(ValueReference<Double> duration) {
		super(duration);
	}

	@Override
	protected void execute() {
		Robot.longDrivetrain.tankDrive(-1, -1);
	}
}
