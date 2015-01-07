package org.usfirst.frc.team3189.robot;

import static org.usfirst.frc.team3189.robot.utility.Variables.*;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Status {
	
	public static final String TEST_AI_KEY    = "Test Analog Input";
	public static final String TEST_DI_KEY    = "Test Digital Input";
	public static final String GYRO_ANGLE_KEY = "Gyro Angle";
	
	public static final String ARCADE_DRIVE_X_SENSITIVITY_FACTOR_KEY = "Arcade Drive X Sensitivity Factor";
	
	public static final String AUTO_FORWARD_POWER_KEY = "Autonomous Forward Power";
	public static final String AUTO_BACKWARD_POWER_KEY = "Autonomous Backward Power";
	public static final String AUTO_ROTATE_POWER_KEY = "Autonomous Rotate Power";
	
	public static final String AUTO_FORWARD_TIME_KEY = "Autonomous Forward Time";
	public static final String AUTO_BACKWARD_TIME_KEY = "Autonomous Backward Time";
	public static final String AUTO_ROTATE_TIME_KEY = "Autonomous Rotate Time";
	
	public static void initStatus () {
		SmartDashboard.putNumber(ARCADE_DRIVE_X_SENSITIVITY_FACTOR_KEY, ARCADE_JOYSTICK_X_SENSITIVITY_FACTOR);
		
		SmartDashboard.putNumber(AUTO_FORWARD_POWER_KEY, AUTO_FORWARD_POWER);
		SmartDashboard.putNumber(AUTO_BACKWARD_POWER_KEY, AUTO_BACKWARD_POWER);
		SmartDashboard.putNumber(AUTO_ROTATE_POWER_KEY, AUTO_ROTATE_POWER);
		
		SmartDashboard.putNumber(AUTO_FORWARD_TIME_KEY, AUTO_FORWARD_TIME);
		SmartDashboard.putNumber(AUTO_BACKWARD_TIME_KEY, AUTO_BACKWARD_TIME);
		SmartDashboard.putNumber(AUTO_ROTATE_TIME_KEY, AUTO_ROTATE_TIME);
	}
	
	public static void updateStatus () {
		SmartDashboard.putBoolean(TEST_DI_KEY, Robot.test.getTestDI());
		SmartDashboard.putNumber(TEST_AI_KEY, Robot.test.getTestAI());
		SmartDashboard.putNumber(GYRO_ANGLE_KEY, Robot.lateralDrivetrain.getGyroAngle());
		
		ARCADE_JOYSTICK_X_SENSITIVITY_FACTOR = SmartDashboard.getNumber(ARCADE_DRIVE_X_SENSITIVITY_FACTOR_KEY);
		
		AUTO_FORWARD_POWER  = SmartDashboard.getNumber(AUTO_FORWARD_POWER_KEY);
		AUTO_BACKWARD_POWER = SmartDashboard.getNumber(AUTO_BACKWARD_POWER_KEY);
		AUTO_ROTATE_POWER   = SmartDashboard.getNumber(AUTO_ROTATE_POWER_KEY);
		
		AUTO_FORWARD_TIME  = SmartDashboard.getNumber(AUTO_FORWARD_TIME_KEY);
		AUTO_BACKWARD_TIME = SmartDashboard.getNumber(AUTO_BACKWARD_TIME_KEY);
		AUTO_ROTATE_TIME   = SmartDashboard.getNumber(AUTO_ROTATE_TIME_KEY);
	}
}
