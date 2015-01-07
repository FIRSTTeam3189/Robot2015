package org.usfirst.frc.team3189.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;
import static org.usfirst.frc.team3189.robot.utility.Variables.*;

/**
 *
 */
public class AutoNextTote extends CommandGroup {
    
    public  AutoNextTote() {
        addSequential(new AutoForward(autoNextToteTime));
        addSequential(new AutoRotate(autoNextToteRotateTime, false));
    }
}
