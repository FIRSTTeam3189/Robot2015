package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.RobotMap;
import org.usfirst.frc.team3189.robot.commands.WinchDoNothing;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * @author Quest Osucha
 */
public class Winch extends Subsystem {
    public SpeedController motor;
    public DigitalInput lowerIR;
    public DigitalInput upperIR;
    public DigitalInput winchLimit;
    
    public Winch() {
    	motor = new Victor(RobotMap.winchMotor);
    	lowerIR = new DigitalInput(RobotMap.winchLowerIRChannel);
    	upperIR = new DigitalInput(RobotMap.winchUpperIRChannel);
    	winchLimit = new DigitalInput(RobotMap.winchLimit);
    }
    
    public void initDefaultCommand() {
    	setDefaultCommand(new WinchDoNothing());
    }
    
    public void setSpeed(double speed) {
    	if ((speed < 0 && winchLimit.get()))
    		kill();
    	else
    		motor.set(speed);
    }
    
    public void kill() {
    	motor.set(0);
    }
    
    public boolean lowerIRState(){
    	return lowerIR.get();
    }
    
    public boolean upperIRState(){
    	return upperIR.get();
    }
}

