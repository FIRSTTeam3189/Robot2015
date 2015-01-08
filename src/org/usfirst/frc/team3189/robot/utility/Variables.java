package org.usfirst.frc.team3189.robot.utility;

public class Variables {
	// This is a longdrivetrain turning factor
	public static ValueReference<Double> ARCADE_JOYSTICK_X_SENSITIVITY_FACTOR = new ValueReference<Double>(.8);
	
	// Autonomous power variables
	public static ValueReference<Double> autoForwardPower  = new ValueReference<Double>(-.5);
	public static ValueReference<Double> AUTO_BACKWARD_POWER = new ValueReference<Double>(.5);
	public static ValueReference<Double> AUTO_ROTATE_POWER   = new ValueReference<Double>(.65);
	
	// Autonomous duration variables
	public static ValueReference<Double> AUTO_FORWARD_TIME  = new ValueReference<Double>(1.0);
	public static ValueReference<Double> AUTO_BACKWARD_TIME = new ValueReference<Double>(1.0);
	public static ValueReference<Double> AUTO_ROTATE_TIME   = new ValueReference<Double>(.5);
	
	// Autonomous pickup variables
	public static ValueReference<Double> PICKUP_FORWARD_TIME  = new ValueReference<Double>(1.0);
	public static ValueReference<Double> PICKUP_BACKWARD_TIME = new ValueReference<Double>(1.0);
	public static ValueReference<Double> PICKUP_TIME          = new ValueReference<Double>(3.0);
	public static ValueReference<Double> PICKUP_ROTATE_TIME   = new ValueReference<Double>(.85);
	
	// Autonomous Score variables
	public static ValueReference<Double> AUTO_SCORE_TIME = new ValueReference<Double>(4.0);
	
	// NExt tote vras
	public static ValueReference<Double> AUTO_NEXT_TOTE_TIME = new ValueReference<Double>(.5);
	public static ValueReference<Double> AUTO_NEXT_TOTE_ROTATE_TIME = new ValueReference<Double>(.72);
}
