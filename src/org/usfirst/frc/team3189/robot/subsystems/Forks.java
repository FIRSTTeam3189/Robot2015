package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.RobotMap;
import org.usfirst.frc.team3189.robot.commands.ForksDoNothing;
import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * @author Quest Osucha
 */
public class Forks extends Subsystem {
	
	public SpeedController motor;
	private DigitalInput slowLimit;
	private DigitalInput stopLimit;
	
	public Forks() {
		motor = new Talon(RobotMap.forkMotor);
		slowLimit = new DigitalInput(RobotMap.slowLimitSwitch);
		stopLimit = new DigitalInput(RobotMap.stopLimitSwitch);
	}
	
    public void initDefaultCommand() {
    	setDefaultCommand(new ForksDoNothing());
    }
    
    public void setSpeed(double speed) {
    	if (stopLimit.get() && speed > 0){
    		motor.set(0);
    	}else if (slowLimit.get() && speed < 0){
    		motor.set(speed * Variables.forkSlowSpeed.get());
    	}else{
    		motor.set(speed * Variables.forkSpeed.get());
    	}
    }
    
    public void kill() {
    	motor.set(0);
    }
    public boolean getStopped(){
    	return stopLimit.get();
    }
    public boolean getSlowed(){
    	return slowLimit.get();
    }
    public double getMotorSpeed(){
    	return motor.get();
    }
}

