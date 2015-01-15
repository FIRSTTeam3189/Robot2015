package org.usfirst.frc.team3189.robot.commands.debug;

import org.usfirst.frc.team3189.robot.utility.ValueReference;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DebugMovement extends CommandGroup {
    
	private static final ValueReference<Double> oneSecond = new ValueReference<Double>(3.0);
	
    public  DebugMovement() {
    	addSequential(new FullForward(oneSecond));
    	addSequential(new FullBackward(oneSecond));
    }
}
