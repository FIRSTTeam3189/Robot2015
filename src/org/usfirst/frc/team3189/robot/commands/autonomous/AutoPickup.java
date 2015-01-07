package org.usfirst.frc.team3189.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;
import static org.usfirst.frc.team3189.robot.utility.Variables.*;

/**
 *
 */
public class AutoPickup extends CommandGroup {
    
    public  AutoPickup() {
        addSequential(new AutoForward(PICKUP_FORWARD_TIME));
        addSequential(new AutoDoNothing(PICKUP_TIME));// <--Replace with pickup command when ready.
        addSequential(new AutoBackward(PICKUP_BACKWARD_TIME));
        addSequential(new AutoRotate(PICKUP_ROTATE_TIME, true));
    }
}
