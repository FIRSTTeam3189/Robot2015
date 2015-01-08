package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.RobotMap;
import org.usfirst.frc.team3189.robot.commands.LateralCommand;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The middle pivoting wheel motor
 * @author Quest Osucha
 */
public class LateralDrivetrain extends Subsystem {
    
	private Talon centerMotor;
    //private AnalogInput sonar;
    
    public LateralDrivetrain() {
    	centerMotor = new Talon(RobotMap.centerMotorChannel);
    	//sonar = new AnalogInput(RobotMap.sonarAnalogChannel);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new LateralCommand());
    }
    /*
    public double getSonarDistance(){
    	return sonar.getVoltage() * Variables.sonarDistanceMultiplier.getData();
    }*/
    
    
    /**
     * Sets movement speed of motor
     * @param power
     */
    public void move(double power){
    	centerMotor.set(power);
    }
    
    /**
     * Stops all movement of the motor
     */
    public void murder(){
    	centerMotor.set(0);
    }
}