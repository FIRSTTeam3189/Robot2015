package org.usfirst.frc.team3189.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoNextTote extends CommandGroup {
    
    public  AutoNextTote() {
        addSequential(new AutoSideways());
    }
}
