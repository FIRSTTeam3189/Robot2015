package org.usfirst.frc.team3189.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// Drivetrain
	public static final int leftMotor = 0;
	public static final int rightMotor = 1;
	public static final int centerMotorChannel = 2;
	
	// Analog inputs
    public static final int sonarAnalogChannel = 0;
    public static final int potentiometerChannel = 1;
	
    // Lifter pistons
	public static final int lifterPiston1Extend  = 0;
	public static final int lifterPiston1Retract = 1;
	
	public static final int lifterPiston2Extend  = 2;
	public static final int lifterPiston2Retract = 3;
	
	// Gearbox
	public static final int gearboxExtendChannel  = 0;
	public static final int gearboxRetractChannel = 1;
	
	// Winch
	public static final int winchMotor = 3;
	public static final int armMovementMotor = 4;
	public static final int forkMotor = 5;
}
