package org.usfirst.frc.team3189.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DrivetrainForward extends CommandGroup {
    
    public  DrivetrainForward() {
        addParallel(new ArcadeDriveCommand());
        addParallel(new LateralCommand());
    }
}
