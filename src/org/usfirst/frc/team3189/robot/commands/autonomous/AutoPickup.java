package org.usfirst.frc.team3189.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;
import static org.usfirst.frc.team3189.robot.utility.Variables.*;

/**
 *
 */
public class AutoPickup extends CommandGroup {
    
    public  AutoPickup() {
        addSequential(new AutoForward(autoPickupForwardTime));
        addSequential(new AutoDoNothing(autoPickupTime));// <--Replace with pickup command when ready.
        addSequential(new AutoBackward(autoPickupBackwardTime));
    }
}
