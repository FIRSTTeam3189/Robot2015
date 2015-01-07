package org.usfirst.frc.team3189.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomous extends CommandGroup {
    public  Autonomous() {
    	addSequential(new AutoPickup());
    	addSequential(new AutoNextTote());
    	addSequential(new AutoScore());
    }
}