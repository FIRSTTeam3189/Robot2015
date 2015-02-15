package org.usfirst.frc.team3189.robot.utility;

public class Variables {
	// Sonar
	
	public static ValueReference<Double> potentiometerLevelInterval = new ValueReference<Double>(3.0);
	public static ValueReference<Double> potentiometerTolerance = new ValueReference<Double>(.007);
	
	// This is the longdrivetrain turning factor
	public static ValueReference<Double> arcadeJoystickXSensitivityFactor = new ValueReference<Double>(.6);
	public static ValueReference<Double> tankDriveRightPowerFactor = new ValueReference<Double>(0.985);
	public static ValueReference<Double> drivetrainIncrement = new ValueReference<Double>(.75);
	public static ValueReference<Double> lowFilterConstant = new ValueReference<Double>(0.98);
	public static ValueReference<Double> heavyFilterConstant = new ValueReference<Double>(0.9);
	
	// Fork Limitation
	public static ValueReference<Double> forkBackwardLimit = new ValueReference<Double>(500.0);
	public static ValueReference<Double> forkForwardLimit = new ValueReference<Double>(810.0);
	
	// The speeds of the winch to rise and fall
	public static ValueReference<Double> winchUpSpeed    = new ValueReference<Double>(.1);
	public static ValueReference<Double> winchDownSpeed  = new ValueReference<Double>(-.1);
	public static ValueReference<Double> winchUpScaler   = new ValueReference<Double>(.8);
	public static ValueReference<Double> winchDownScaler = new ValueReference<Double>(.8);
	
	// The speeds of the arm to extend & retract
	public static ValueReference<Double> armExtendSpeed  = new ValueReference<Double>(.25);
	public static ValueReference<Double> armRetractSpeed = new ValueReference<Double>(-.25);
	
	// NExt tote vras
	public static ValueReference<Double> forkExtendSpeed = new ValueReference<Double>(1.0);
	public static ValueReference<Double> forkRetractSpeed = new ValueReference<Double>(-1.0);
	
	public static ValueReference<String> winchMovingUp = new ValueReference<String>("None");
	
	// Winch Time Levels
	public static ValueReference<Double> winchUpLevelTime = new ValueReference<Double>(3.0);
	public static ValueReference<Double> winchDownLevelTime = new ValueReference<Double>(3.0);
	
	// Auto Speed Vars
	public static ValueReference<Double> autoForwardSpeed  = new ValueReference<Double>(.5);
	public static ValueReference<Double> autoBackwardSpeed = new ValueReference<Double>(.5);
	
	public static ValueReference<Double> autoLeftSpeed     = new ValueReference<Double>(.5);
	public static ValueReference<Double> autoRightSpeed    = new ValueReference<Double>(.5);
	
	public static ValueReference<Double> autoTurnLeftSpeed  = new ValueReference<Double>(.5);
	public static ValueReference<Double> autoTurnRightSpeed = new ValueReference<Double>(.5);
	
	public static ValueReference<Double> autoForksExtendSpeed  = new ValueReference<Double>(.5);
	public static ValueReference<Double> autoForksRetractSpeed = new ValueReference<Double>(.5);
	
	//Auto Time Vars
	public static ValueReference<Double> autoGoForwardTime = new ValueReference<Double>(.3);
	public static ValueReference<Double> autoGoBackwardTime = new ValueReference<Double>(.8);
	public static ValueReference<Double> autoGoLeftTime = new ValueReference<Double>(2.0);
}
