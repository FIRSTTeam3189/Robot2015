
package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.RobotMap;
import org.usfirst.frc.team3189.robot.commands.AccereratingDriveCommand;
import org.usfirst.frc.team3189.robot.commands.ArcadeDriveCommand;
import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LongDrivetrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private RobotDrive drive;
	private double magnitude;
	private double direction;
	
	public LongDrivetrain() {
		drive = new RobotDrive(RobotMap.leftMotor, RobotMap.rightMotor);
	}

    public void initDefaultCommand() {
        setDefaultCommand(new AccereratingDriveCommand());
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
    
    public void arcadeDriveIncremental(double magnitude, double direction) {
    	this.magnitude = (this.magnitude * Variables.drivetrainIncrement.get()) + (magnitude * Math.abs(1 - Variables.drivetrainIncrement.get()));
    	this.direction = (this.direction * Variables.drivetrainIncrement.get()) + (direction * Math.abs(1 - Variables.drivetrainIncrement.get()));
    	drive.arcadeDrive(this.magnitude, this.direction);
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

