package org.usfirst.frc.team3189.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DrivetrainBackward extends CommandGroup {
    
    public  DrivetrainBackward() {
        addParallel(new ArcadeBackwardDriveCommand());
        addParallel(new LateralBackwardsCommand());
    }
}
