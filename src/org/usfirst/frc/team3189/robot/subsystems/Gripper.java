package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.RobotMap;
import org.usfirst.frc.team3189.robot.commands.GripperDoNothing;
import org.usfirst.frc.team3189.robot.utility.Piston;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Gripper extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Piston gripperPiston = new Piston(RobotMap.gripperExtendChannel, RobotMap.gripperRetractChannel, false);

    public void initDefaultCommand() {
        setDefaultCommand(new GripperDoNothing());
    }
    
    public void extendGripper(){
    	gripperPiston.extend();
    }
    
    public void retractGripper(){
    	gripperPiston.retract();
    }
}

