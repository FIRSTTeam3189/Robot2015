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
    private SpeedController motor;
    private SpeedController motor2;
    private DigitalInput lowerLimit;
    private DigitalInput upperLimit;

    private int currentLevel = 0;
    
    public Winch() {
    	motor = new Victor(RobotMap.winchMotor);
    	motor2 = new Victor(RobotMap.winchMotor2);
    	lowerLimit = new DigitalInput(RobotMap.winchLowerLimitChannel);
    	upperLimit = new DigitalInput(RobotMap.winchUpperLimitChannel);
    }
    
    public void initDefaultCommand() {
    	setDefaultCommand(new WinchControlCommand());
    }
    
    public void setSpeed(double speed){
    	if ((speed < 0 && upperLimit.get()))
    		kill();
    	else if (speed > 0 && lowerLimit.get())
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
    
    public void upLevel(){
    	if (currentLevel < 3)
    		currentLevel++;
    }
    
    public void downLevel(){
    	if (currentLevel > 0)
    		currentLevel--;
    }
    
    public void resetLevel(){
    	currentLevel = 0;
    }
    
    public double getScaledUpTime(){
    	return Variables.winchUpLevelTime.get() - currentLevel * Variables.winchUpScaler.get();
    }
    
    public double getScaledDownTime(){
    	return Variables.winchDownLevelTime.get() - currentLevel * Variables.winchDownScaler.get();
    }

    public void kill() {
    	motor.set(0);
    	motor2.set(0);
    }
    
    public boolean getUpperState () {
    	return upperLimit.get();
    }
    
    public boolean getLowerState () {
    	return lowerLimit.get();
    }
}

