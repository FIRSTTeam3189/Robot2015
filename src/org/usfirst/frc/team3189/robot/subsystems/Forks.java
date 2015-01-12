package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * @author Quest Osucha
 */
public class Forks extends Subsystem {
	
	public SpeedController motor;
	
	public Forks() {
		motor = new Talon(RobotMap.forkMotor);
	}
	
    public void initDefaultCommand() {
//    	setDefaultCommand(command);
    }
    
    public void setSpeed(double speed) {
    	motor.set(speed);
    }
    
    public void kill() {
    	motor.set(0);
    }
}

