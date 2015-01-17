package org.usfirst.frc.team3189.robot.utility;

public class Variables {
	// Sonar
	public static ValueReference<Double> sonarDistanceMultiplier = new ValueReference<Double>(.1596);
	public static ValueReference<Double> sonarInRangeInInches = new ValueReference<Double>(16.0);
	
	public static ValueReference<Double> potentiometerLevelInterval = new ValueReference<Double>(3.0);
	public static ValueReference<Double> potentiometerTolerance = new ValueReference<Double>(.007);
	
	// This is the longdrivetrain turning factor
	public static ValueReference<Double> arcadeJoystickXSensitivityFactor = new ValueReference<Double>(.6);
	public static ValueReference<Double> tankDriveRightPowerFactor = new ValueReference<Double>(0.985);
	
	// The speeds of the forks to open and close
	public static ValueReference<Double> forkOpenSpeed  = new ValueReference<Double>(1.0);
	public static ValueReference<Double> forkCloseSpeed = new ValueReference<Double>(-1.0);
	public static ValueReference<Double> forkSpeed = new ValueReference<Double>(.05);
	public static ValueReference<Double> forkSlowSpeed = new ValueReference<Double>(.02);
	
	// The speeds of the winch to rise and fall
	public static ValueReference<Double> winchUpSpeed   = new ValueReference<Double>(.25);
	public static ValueReference<Double> winchDownSpeed = new ValueReference<Double>(-.25);
	
	// The speeds of the arm to extend & retract
	public static ValueReference<Double> armExtendSpeed  = new ValueReference<Double>(.25);
	public static ValueReference<Double> armRetractSpeed = new ValueReference<Double>(-.25);
	
	
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
	public static ValueReference<Double> autoPickupForwardTime  = new ValueReference<Double>(5.0);
	public static ValueReference<Double> autoPickupBackwardTime = new ValueReference<Double>(1.0);
	public static ValueReference<Double> autoPickupTime         = new ValueReference<Double>(3.0);
	public static ValueReference<Double> autoPickupRotateTime   = new ValueReference<Double>(1.01);
	
	// Autonomous Score variables
	public static ValueReference<Double> autoScoreTime = new ValueReference<Double>(4.0);
	
	// NExt tote vras
	public static ValueReference<Double> autoNextToteTime = new ValueReference<Double>(.5);
	public static ValueReference<Double> autoNextToteRotateTime = new ValueReference<Double>(.72);
}
