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
	
	public static ValueReference<Double> forkForwardLimit = new ValueReference<Double>(3.69);
	public static ValueReference<Double> forkBackwardLimit = new ValueReference<Double>(0.5);
	
	// The speeds of the winch to rise and fall
	public static ValueReference<Double> winchUpSpeed   = new ValueReference<Double>(.1);
	public static ValueReference<Double> winchDownSpeed = new ValueReference<Double>(-.1);
	
	// The speeds of the arm to extend & retract
	public static ValueReference<Double> armExtendSpeed  = new ValueReference<Double>(.25);
	public static ValueReference<Double> armRetractSpeed = new ValueReference<Double>(-.25);
	
	// NExt tote vras
	public static ValueReference<Double> forkCloseSpeed = new ValueReference<Double>(-1.0);
	public static ValueReference<Double> forkOpenSpeed = new ValueReference<Double>(1.0);
	
	public static ValueReference<String> winchMovingUp = new ValueReference<String>("None");
}
