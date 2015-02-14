package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.RobotMap;
import org.usfirst.frc.team3189.robot.commands.ForksDoNothing;
import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * @author Quest Osucha
 */
public class Forks extends Subsystem {
	
	private SpeedController motor;
	
	private AnalogInput potentiometer;
	
	public Forks() {
		motor = new Victor(RobotMap.forkMotor);
		potentiometer = new AnalogInput(RobotMap.potentiometerChannel);
	}
	
    public void initDefaultCommand() {
    	setDefaultCommand(new ForksDoNothing());
    }
    
    public void setSpeed(double speed) {
    	if ((potentiometer.getVoltage() > Variables.forkForwardLimit.get()) && speed < 0)
    		speed = 0;
    	if ((potentiometer.getVoltage() < Variables.forkBackwardLimit.get()) && speed > 0)
    		speed = 0;
    	
    	motor.set(speed);
    }
    
    public void kill() {
    	motor.set(0);
    }

    public double getMotorSpeed(){
    	return motor.get();
    }
    
    public double getPotRotation(){
    	return potentiometer.getVoltage();
    }
}

