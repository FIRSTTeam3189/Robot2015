package org.usfirst.frc.team3189.robot.commands.autonomous;

import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomous extends CommandGroup {
    public  Autonomous() {
    	addSequential(new AutoForward(Variables.autoNextToteTime));
    	addSequential(new AutoRotate(Variables.autoRotateTime, false));
    	addSequential(new AutoForward(Variables.autoForwardTime));
    	addSequential(new AutoBackward(Variables.autoBackwardTime));
    	addSequential(new AutoRotate(Variables.autoRotateTime, true));
    	addSequential(new AutoForward(Variables.autoNextToteTime));
    }
}
