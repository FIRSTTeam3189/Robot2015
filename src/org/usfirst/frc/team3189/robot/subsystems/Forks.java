package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.RobotMap;
import org.usfirst.frc.team3189.robot.commands.ForksDoNothing;
import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * @author Quest Osucha
 */
public class Forks extends Subsystem {
	
	private SpeedController motor;
	
	private AnalogPotentiometer potentiometer;
	
	public Forks() {
		motor = new Victor(RobotMap.forkMotor);
		potentiometer = new AnalogPotentiometer(RobotMap.potentiometerChannel, 1000.0);
	}
	
    public void initDefaultCommand() {
    	setDefaultCommand(new ForksDoNothing());
    }
    
    public void setSpeed(double speed) {
    	if (!canMoveForward() && speed > 0)
    		speed = 0;
    	if (!canMoveBackward() && speed < 0)
    		speed = 0;
    	
    	// Matching physical wiring    	
    	motor.set(-speed);
    }
    
    public void kill() {
    	motor.set(0);
    }

    public double getMotorSpeed(){
    	return motor.get();
    }
    
    public double getPotRotation(){
    	return potentiometer.get();
    }
    
    public boolean canMoveBackward(){
    	return getPotRotation() > Variables.forkBackwardLimit.get();
    }
    
    public boolean canMoveForward(){
    	return getPotRotation() < Variables.forkForwardLimit.get();
    }
}

