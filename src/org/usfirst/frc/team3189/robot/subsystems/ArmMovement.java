package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.RobotMap;
import org.usfirst.frc.team3189.robot.commands.ArmMovementDoNothing;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * @author Quest Osucha
 */
public class ArmMovement extends Subsystem {
	
	public SpeedController motor;
	
	public ArmMovement() {
		motor = new Talon(RobotMap.armMovementMotor);
	}
	
    public void initDefaultCommand() {
    	setDefaultCommand(new ArmMovementDoNothing());
    }
    
    public void setSpeed(double speed) {
    	motor.set(speed);
    }
    
    public void kill() {
    	motor.set(0);
    }
}

