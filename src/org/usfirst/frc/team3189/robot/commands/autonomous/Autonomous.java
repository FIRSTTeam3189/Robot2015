package org.usfirst.frc.team3189.robot.commands.autonomous;

import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomous extends CommandGroup {
	
    public  Autonomous() {
    	addSequential(new AutoForward(Variables.AUTO_FORWARD_TIME));
    	addSequential(new AutoRotate(Variables.AUTO_ROTATE_TIME, true));
    	addSequential(new AutoRotate(Variables.AUTO_ROTATE_TIME, false));
    	addSequential(new AutoBackward(Variables.AUTO_ROTATE_TIME));
    }
}
