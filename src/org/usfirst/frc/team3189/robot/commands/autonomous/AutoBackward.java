package org.usfirst.frc.team3189.robot.commands.autonomous;

import org.usfirst.frc.team3189.robot.Robot;
import org.usfirst.frc.team3189.robot.utility.ValueReference;
import org.usfirst.frc.team3189.robot.utility.Variables;

/**
 *
 */
public class AutoBackward extends AutoForward {
	
    public AutoBackward(ValueReference<Double> duration) {
		super(duration);
	}

    @Override
    protected void execute() {
    	Robot.longDrivetrain.tankDrive(Variables.autoBackwardPower.getData(), Variables.autoBackwardPower.getData());
    }
}
