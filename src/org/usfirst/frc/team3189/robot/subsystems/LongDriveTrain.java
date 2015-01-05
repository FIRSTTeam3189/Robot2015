
package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.RobotMap;
import org.usfirst.frc.team3189.robot.commands.TankDriveCommand;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LongDriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private SpeedController left;
	private SpeedController right;
	
	public LongDriveTrain() {
		left = new Talon(RobotMap.leftMotor);
		right = new Talon(RobotMap.rightMotor);
	}

    public void initDefaultCommand() {
        setDefaultCommand(new TankDriveCommand());
    }
    
    public void move (double leftPwr, double rightPwr) {
    	left.set(leftPwr);
    	right.set(rightPwr);
    }
    
    public void kill () {
    	left.set(0);
    	right.set(0);
    }
}

