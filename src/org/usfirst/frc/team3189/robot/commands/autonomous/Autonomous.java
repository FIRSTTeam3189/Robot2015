package org.usfirst.frc.team3189.robot.commands.autonomous;

import org.usfirst.frc.team3189.robot.utility.ValueReference;
import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomous extends CommandGroup {
    public  Autonomous() {
    	for (int i = 0; i < 2; ++i) {
    		addSequential(new AutoSidewaysRight());
    		addSequential(new AutoForward(Variables.autoForwardTime));
    		addSequential(new AutoSidewaysLeft());
    	}
    	addSequential(new AutoRotate(Variables.autoRotateTime, false));
    	addSequential(new AutoBackward(Variables.autoBackwardTime));
    }
}
