package org.usfirst.frc.team3189.robot.subsystems;

import static org.usfirst.frc.team3189.robot.RobotMap.*;
import org.usfirst.frc.team3189.robot.utility.Piston;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LifterPneumatics extends Subsystem {
    
    private Piston lifterPiston1, lifterPiston2;
    
    public LifterPneumatics(){
    	lifterPiston1 = new Piston(lifterPiston1Extend, lifterPiston1Retract, false);
    	lifterPiston2 = new Piston(lifterPiston2Extend, lifterPiston2Retract, false);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    /**
     * extends lifter pistons if the parameter is true
     * @param isExtended
     */
    public void setExtended(boolean isExtended) {
    	if (isExtended) {
    		lifterPiston1.extend();
    		lifterPiston2.extend();
    	}else{
    		lifterPiston1.retract();
    		lifterPiston2.retract();
    	}
    }
    /**
     * Toggles lifter pistons.
     */
    public void toggle() {
    	lifterPiston1.toggle();
    	lifterPiston2.toggle();
    }
}

