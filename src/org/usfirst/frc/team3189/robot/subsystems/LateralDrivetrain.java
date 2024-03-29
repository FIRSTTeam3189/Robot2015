package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.Robot;
import org.usfirst.frc.team3189.robot.RobotMap;
import org.usfirst.frc.team3189.robot.commands.LateralCommand;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The middle pivoting wheel motor
 * @author Quest Osucha
 */
public class LateralDrivetrain extends Subsystem {
    
	private SpeedController centerMotor;
    
    public LateralDrivetrain() {
    	centerMotor = new Talon(RobotMap.centerMotorChannel);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new LateralCommand());
    }
    
    /**
     * Sets movement speed of motor
     * @param power
     */
    public void move(double power){
    	centerMotor.set(power);
    }
    
    /**
     * Sets movement speed of motor
     * @param power
     */
    public void moveThrottled(double power){
    	centerMotor.set(power * Robot.oi.getRotationalJoyStickThrottle());
    }
    
    /**
     * Stops all movement of the motor
     */
    public void murder(){
    	centerMotor.set(0);
    }
}