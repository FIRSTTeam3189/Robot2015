
package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.RobotMap;
import org.usfirst.frc.team3189.robot.commands.ArcadeDriveCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LongDrivetrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private RobotDrive drive;
	
	public LongDrivetrain() {
		drive = new RobotDrive(RobotMap.leftMotor, RobotMap.rightMotor);
	}

    public void initDefaultCommand() {
        setDefaultCommand(new ArcadeDriveCommand());
    }
    
    /**
     * Tank drive method for drivetrain
     * @param left power to left side
     * @param right power to right side
     */
    public void tankDrive(double left, double right) {
    	drive.tankDrive(left, right);
    	
    }
    
    public void tankDrive(double left, double right, double rightPowerFactor) {
    	drive.tankDrive(left, right * rightPowerFactor);
    	
    }
    
    
    /**
     * arcade drive method for drive train
     * @param magnitude the speed of the robot
     * @param direction the direction to turn in
     */
    public void arcadeDrive(double magnitude, double direction) {
    	drive.arcadeDrive(magnitude, direction);
    }
    
    public void kill () {
    	drive.stopMotor();
    }
}

