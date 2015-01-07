package org.usfirst.frc.team3189.robot.commands.autonomous;

import static org.usfirst.frc.team3189.robot.utility.Variables.PICKUP_FORWARD_TIME;
import static org.usfirst.frc.team3189.robot.utility.Variables.PICKUP_TIME;
import static org.usfirst.frc.team3189.robot.utility.Variables.AUTO_SCORE_TIME;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoScore extends CommandGroup {
    
    public  AutoScore() {
    	addSequential(new AutoForward(PICKUP_FORWARD_TIME));
        addSequential(new AutoDoNothing(PICKUP_TIME));// <--Replace with pickup command when ready.
        addSequential(new AutoBackward(AUTO_SCORE_TIME));
    }
}