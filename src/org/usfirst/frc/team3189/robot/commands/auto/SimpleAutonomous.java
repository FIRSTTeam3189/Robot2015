package org.usfirst.frc.team3189.robot.commands.auto;

import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class SimpleAutonomous extends CommandGroup {
    
    public  SimpleAutonomous() {
    	addSequential(new GoForward(Variables.autoGoForwardTime));
    	addSequential(new WinchUpLevel());
    	addSequential(new GoBackward(Variables.autoGoBackwardTime));
    	addSequential(new GoRight(Variables.autoGoLeftTime));
    	addParallel(new WinchDownLevel());
    	addSequential(new WaitCommand(.5));
    	addSequential(new GoBackward(Variables.autoGoBackwardTime2));
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
