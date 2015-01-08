package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.RobotMap;
import org.usfirst.frc.team3189.robot.utility.Piston;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * 
 */
public class Gearbox extends Subsystem {
    
    private Piston shifter;
    
    public Gearbox() {
    	shifter = new Piston(RobotMap.gearboxExtendChannel, RobotMap.gearboxRetractChannel, false);
    }
    
    public void initDefaultCommand() {
    	
    }
    
    public void setState(boolean isExtended) {
    	if (isExtended){
    		shifter.extend();
    	} else {
    		shifter.retract();
    	}
    }
    
    public void toggleState() {
    	shifter.toggle();
    }
}