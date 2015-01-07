package org.usfirst.frc.team3189.robot.utility;

public class Variables {
	// This is a longdrivetrain turning factor
	public static ValueReference<Double> ARCADE_JOYSTICK_X_SENSITIVITY_FACTOR = new ValueReference<Double>(.8);
	
	// Autonomous power variables
	public static ValueReference<Double> autoForwardPower  = new ValueReference<Double>(-.5);
	public static ValueReference<Double> autoBackwardPower = new ValueReference<Double>(.5);
	public static ValueReference<Double> autoRotatePower   = new ValueReference<Double>(.65);
	
	// Autonomous duration variables
	public static ValueReference<Double> autoForwardTime  = new ValueReference<Double>(1.0);
	public static ValueReference<Double> autoBackwardTime = new ValueReference<Double>(1.0);
	public static ValueReference<Double> autoRotateTime   = new ValueReference<Double>(.5);
	
	// Autonomous pickup variables
	public static ValueReference<Double> autoPickupForwardTime  = new ValueReference<Double>(1.0);
	public static ValueReference<Double> autoPickupBackwardTime = new ValueReference<Double>(1.0);
	public static ValueReference<Double> autoPickupTime         = new ValueReference<Double>(3.0);
	public static ValueReference<Double> autoPickupRotateTime   = new ValueReference<Double>(.85);
	
	// Autonomous Score variables
	public static ValueReference<Double> autoScoreTime = new ValueReference<Double>(4.0);
	
	// NExt tote vras
	public static ValueReference<Double> autoNextToteTime = new ValueReference<Double>(.5);
	public static ValueReference<Double> autoNextToteRotateTime = new ValueReference<Double>(.72);
}
