package org.usfirst.frc.team3189.robot.commands;

import org.usfirst.frc.team3189.robot.commands.autonomous.AutoBackward;
import org.usfirst.frc.team3189.robot.commands.autonomous.AutoForward;
import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DebugMovement extends CommandGroup {
    
    public  DebugMovement() {
    	addSequential(new AutoForward(Variables.autoForwardTime));
    	addSequential(new AutoBackward(Variables.autoBackwardTime));
    }
}
