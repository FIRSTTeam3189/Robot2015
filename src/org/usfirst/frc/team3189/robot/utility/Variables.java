package org.usfirst.frc.team3189.robot.utility;

public class Variables {
	// This is the longdrivetrain turning factor
	public static ValueReference<Double> arcadeJoystickXSensitivityFactor = new ValueReference<Double>(.8);
	
	// The speeds of the winch to retract and extend
	public static ValueReference<Double> winchExtendSpeed  = new ValueReference<Double>(.25);
	public static ValueReference<Double> winchRetractSpeed = new ValueReference<Double>(.25);
	
	// Sonar
	public static ValueReference<Double> sonarDistanceMultiplier = new ValueReference<Double>(.1596);
	public static ValueReference<Double> sonarInRangeInInches = new ValueReference<Double>(16.0);
	
	// Autonomous power variables
	public static ValueReference<Double> autoForwardPower  = new ValueReference<Double>(-.5);
	public static ValueReference<Double> autoBackwardPower = new ValueReference<Double>(.5);
	public static ValueReference<Double> autoRotatePower   = new ValueReference<Double>(.65);
	public static ValueReference<Double> autoSidewaysPower = new ValueReference<Double>(.5);
	
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

	// Autonomous winch time vars
	public static ValueReference<Double> autoWinchExtendTime  = new ValueReference<Double>(1.0);
	public static ValueReference<Double> autoWinchRetractTime = new ValueReference<Double>(1.0);
	
	// NExt tote vras
	public static ValueReference<Double> autoNextToteTime = new ValueReference<Double>(.5);
	public static ValueReference<Double> autoNextToteRotateTime = new ValueReference<Double>(.72);
}