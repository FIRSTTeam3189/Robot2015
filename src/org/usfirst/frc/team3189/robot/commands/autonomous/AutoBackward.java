package org.usfirst.frc.team3189.robot.commands.autonomous;

import org.usfirst.frc.team3189.robot.Robot;
import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoBackward extends AutoForward {
	
    public AutoBackward(double duration) {
		super(duration);
	}

    @Override
    protected void execute() {
    	Robot.longDrivetrain.tankDrive(Variables.AUTO_BACKWARD_POWER, Variables.AUTO_BACKWARD_POWER);
    }
}
