package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.RobotMap;
import org.usfirst.frc.team3189.robot.commands.WinchDoNothing;
import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * @author Quest Osucha
 */
public class Winch extends Subsystem {
    public SpeedController motor;
    public DigitalInput irSensor;
    public DigitalInput lowerLimit;
    public DigitalInput upperLimit;
    private boolean aboveIR;
    
    public Winch() {
    	motor = new Victor(RobotMap.winchMotor);
    	irSensor = new DigitalInput(RobotMap.winchIRChannel);
    	lowerLimit = new DigitalInput(RobotMap.winchLowerLimitChannel);
    	upperLimit = new DigitalInput(RobotMap.winchUpperLimitChannel);
    }
    
    public void initDefaultCommand() {
    	setDefaultCommand(new WinchDoNothing());
    }
    
    public void setSpeed(double speed) {
    	if ((speed < 0 && upperLimit.get()))
    		kill();
    	else
    		motor.set(speed);
    }
    
    public void moveToIRMedium () {
    	if (!getIRState()) {
    		if (aboveIR) {
    			moveDown();
    		} else {
    			moveUp();
    		}
    	}
    }
    

    public void moveToTop () {
    	if (!getUpperState()) {
    		moveUp();
    	} else {
    		kill();
    		aboveIR = true;
    	}
    }
    
    public void moveToBottom () {
    	if (!getLowerState()) {
    		moveDown();
    	} else {
    		kill();
    		aboveIR = false;
    	}
    }
    
    private void moveUp () {
    	setSpeed(Variables.winchUpSpeed.get());
    }
    
    private void moveDown () {
    	setSpeed(Variables.winchDownSpeed.get());
    }
    

    public void kill() {
    	motor.set(0);
    }
    
    public boolean getIRState(){
    	return irSensor.get();
    }
    
    public boolean getUpperState () {
    	return upperLimit.get();
    }
    
    public boolean getLowerState () {
    	return lowerLimit.get();
    }
}

