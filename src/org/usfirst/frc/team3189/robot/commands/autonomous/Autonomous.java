package org.usfirst.frc.team3189.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomous extends CommandGroup {
	
    public  Autonomous() {
    	addSequential(new AutoForward(2));
    	addSequential(new AutoRotate(3, true));
    	addSequential(new AutoRotate(3, false));
    	addSequential(new AutoBackward(3));
    }
}
