package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.RobotMap;
import org.usfirst.frc.team3189.robot.commands.WinchControlCommand;
import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * @author Quest Osucha
 */
public class Winch extends Subsystem {
    public SpeedController motor;
    public SpeedController motor2;
    public DigitalInput irSensor;
    public DigitalInput lowerLimit;
    public DigitalInput upperLimit;
    private boolean aboveIR;
    
    public Winch() {
    	motor = new Victor(RobotMap.winchMotor);
    	motor2 = new Victor(RobotMap.winchMotor2);
    	irSensor = new DigitalInput(RobotMap.winchIRChannel);
    	lowerLimit = new DigitalInput(RobotMap.winchLowerLimitChannel);
    	upperLimit = new DigitalInput(RobotMap.winchUpperLimitChannel);
    }
    
    public void initDefaultCommand() {
    	setDefaultCommand(new WinchControlCommand());
    }
    
    public void setSpeed(double speed) {
    	if ((speed < 0 && upperLimit.get()))
    		kill();
    	else{
    		motor.set(speed);
    		motor2.set(speed);
    	}
    	
    }
    
    public void setSpeedLeft(double speed) {
    	motor.set(-speed);
    }
    
    public void setSpeedRight(double speed){
    	motor2.set(-speed);
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
    		Variables.winchMovingUp.set("Moving Up");
    	} else {
    		kill();
    		aboveIR = true;
    		Variables.winchMovingUp.set("Not moving up");
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
    	motor2.set(0);
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

