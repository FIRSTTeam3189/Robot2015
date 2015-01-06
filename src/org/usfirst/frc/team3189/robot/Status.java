package org.usfirst.frc.team3189.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Status {
	
	public static final String TEST_AI_KEY    = "Test Analog Input";
	public static final String TEST_DI_KEY    = "Test Digital Input";
	public static final String GYRO_ANGLE_KEY = "Gyro Angle";
	
	public static void initStatus () {
		
	}
	
	public static void updateStatus () {
		SmartDashboard.putBoolean(TEST_DI_KEY, Robot.test.getTestDI());
		SmartDashboard.putNumber(TEST_AI_KEY, Robot.test.getTestAI());
		SmartDashboard.putNumber(GYRO_ANGLE_KEY, Robot.lateralDrivetrain.getGyroAngle());
	}
}
