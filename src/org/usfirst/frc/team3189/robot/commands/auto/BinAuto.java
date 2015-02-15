package org.usfirst.frc.team3189.robot.commands.auto;

import org.usfirst.frc.team3189.robot.commands.ForksExtend;
import org.usfirst.frc.team3189.robot.utility.ValueReference;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class BinAuto extends CommandGroup {
    
    public  BinAuto() {
    	addSequential(new ForksExtend());
    	addSequential(new GoForward(new ValueReference<Double>(.5)));
    	addSequential(new WinchUpLevel());
    	addSequential(new GoLeft(new ValueReference<Double>(3.0)));
    	addSequential(new WinchDownLevel());
    	
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