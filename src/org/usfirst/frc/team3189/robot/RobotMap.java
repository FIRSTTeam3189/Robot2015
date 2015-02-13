package org.usfirst.frc.team3189.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	/*
	 * PWM
	 */
	// Drivetrain
	public static final int leftMotor = 0;
	public static final int rightMotor = 1;
	public static final int centerMotorChannel = 2;
	// Winch
	public static final int winchMotorLeft = 3;
	public static final int armMovementMotor = 4;
	public static final int forkMotor = 5;
	public static final int winchMotorRight = 6;
	
	/*
	 * Analog Inputs
	 */
	public static final int gyroChannel = 1;
    public static final int sonarAnalogChannel = 0;
    public static final int potentiometerChannel = 2;
    
    
    /*
     * Digital IO
     */
	public static final int lifterPiston1Extend  = 0;
	public static final int lifterPiston1Retract = 1;
	
	public static final int lifterPiston2Extend  = 2;
	public static final int lifterPiston2Retract = 3;
	
	// Gearbox
	public static final int gearboxExtendChannel  = 0;
	public static final int gearboxRetractChannel = 1;
	
	// Gripper
	public static final int gripperExtendChannel  = 0;
	public static final int gripperRetractChannel = 1;
	
	public static final int winchUpperLimitChannel = 4;
	

	/*
	 *  Relay
	 */
	
	public static final int winchIRChannel = 2;
	public static final int winchLowerLimitChannel = 3;
}
