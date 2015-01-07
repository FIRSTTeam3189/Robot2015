package org.usfirst.frc.team3189.robot.commands.autonomous;

import static org.usfirst.frc.team3189.robot.utility.Variables.autoPickupForwardTime;
import static org.usfirst.frc.team3189.robot.utility.Variables.autoPickupTime;
import static org.usfirst.frc.team3189.robot.utility.Variables.autoScoreTime;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoScore extends CommandGroup {
    
    public  AutoScore() {
    	addSequential(new AutoForward(autoPickupForwardTime));
        addSequential(new AutoDoNothing(autoPickupTime));// <--Replace with pickup command when ready.
        addSequential(new AutoBackward(autoScoreTime));
    }
}