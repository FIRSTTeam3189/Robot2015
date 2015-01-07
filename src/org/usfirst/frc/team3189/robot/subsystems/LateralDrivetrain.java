package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.RobotMap;
import org.usfirst.frc.team3189.robot.commands.LateralCommand;
import org.usfirst.frc.team3189.robot.utility.Variables;

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
    
    private AnalogInput analogGyroChannel;
    private Gyro gyro;
    
    private AnalogInput analogSonarChannel;
    
    public LateralDrivetrain() {
    	centerMotor = new Talon(RobotMap.centerMotorChannel);
    	analogGyroChannel = new AnalogInput(RobotMap.aiGyroChannel);
    	gyro = new Gyro(analogGyroChannel);
    	analogSonarChannel = new AnalogInput(RobotMap.aiSonarChannel);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new LateralCommand());
    }
    
    /**
     * @return The angle of the gyro
     */
    public double getGyroAngle(){
    	return gyro.getAngle();
    }
    
    public double getSonarDistance(){
    	return analogSonarChannel.getValue() * Variables.sonarDistanceMultiplier.getData();
    }
    
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