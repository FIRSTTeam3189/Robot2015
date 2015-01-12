package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.RobotMap;
import org.usfirst.frc.team3189.robot.commands.WinchDoNothing;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * @author Quest Osucha
 */
public class Winch extends Subsystem {
    public SpeedController motor;
    public AnalogInput potentiometer;
	
    public Winch() {
    	motor = new Talon(RobotMap.armMovementMotor);
    	potentiometer = new AnalogInput(RobotMap.potentiometerChannel);
    }
    
    public void initDefaultCommand() {
    	setDefaultCommand(new WinchDoNothing());
    }
    
    public void setSpeed(double speed) {
    	motor.set(speed);
    }
    
    public void kill() {
    	motor.set(0);
    }
    
    /**
     * This method gets the value of the potentiometer.
     * @return the value of the potentiometer
     */
    public double getPotRotation() {
    	return potentiometer.getValue();
    }
}

