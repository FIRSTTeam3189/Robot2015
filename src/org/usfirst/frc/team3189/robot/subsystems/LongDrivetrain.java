
package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.RobotMap;
import org.usfirst.frc.team3189.robot.commands.ArcadeDriveCommand;

import edu.wpi.first.wpilibj.Joystick;
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
    
    public void move (Joystick joystick) {
    	drive.arcadeDrive(joystick, true);
    }
    
    public void kill () {
    	drive.stopMotor();
    }
}

