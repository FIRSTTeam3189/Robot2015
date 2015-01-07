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
	
	// Autonomous pickup variables
	public static final String PICKUP_FORWARD_TIME_KEY = "Pickup Forward Time";
	public static final String PICKUP_BACKWARD_TIME_KEY = "Pickup Backward Time";
	public static final String PICKUP_TIME_KEY = "Pickup Time (Ghost Code)";
	public static final String PICKUP_ROTATE_TIME_KEY = "Pickup Rotate Time";
	
	public static final String AUTO_NEXT_TOTE_TIME_KEY = "Tote Next Time";
	public static final String AUTO_NEXT_TOTE_ROTATE_TIME_KEY = "Tote Next Rotate Time";

	public static final String AUTO_SCORE_TIME_KEY = "Score Time";
	
	public static void initStatus () {
		SmartDashboard.putNumber(ARCADE_DRIVE_X_SENSITIVITY_FACTOR_KEY, ARCADE_JOYSTICK_X_SENSITIVITY_FACTOR.getData());
		
		SmartDashboard.putNumber(AUTO_FORWARD_POWER_KEY, autoForwardPower.getData());
		SmartDashboard.putNumber(AUTO_BACKWARD_POWER_KEY, AUTO_BACKWARD_POWER.getData());
		SmartDashboard.putNumber(AUTO_ROTATE_POWER_KEY, AUTO_ROTATE_POWER.getData());
		
		SmartDashboard.putNumber(AUTO_FORWARD_TIME_KEY, AUTO_FORWARD_TIME.getData());
		SmartDashboard.putNumber(AUTO_BACKWARD_TIME_KEY, AUTO_BACKWARD_TIME.getData());
		SmartDashboard.putNumber(AUTO_ROTATE_TIME_KEY, AUTO_ROTATE_TIME.getData());
		
		SmartDashboard.putNumber(PICKUP_FORWARD_TIME_KEY, PICKUP_FORWARD_TIME.getData());
		SmartDashboard.putNumber(PICKUP_BACKWARD_TIME_KEY, PICKUP_BACKWARD_TIME.getData());
		SmartDashboard.putNumber(PICKUP_TIME_KEY, PICKUP_TIME.getData());
		SmartDashboard.putNumber(PICKUP_ROTATE_TIME_KEY, PICKUP_ROTATE_TIME.getData());
		
		SmartDashboard.putNumber(AUTO_NEXT_TOTE_TIME_KEY, AUTO_NEXT_TOTE_TIME.getData());
		SmartDashboard.putNumber(AUTO_NEXT_TOTE_ROTATE_TIME_KEY, AUTO_NEXT_TOTE_ROTATE_TIME.getData());
		
		SmartDashboard.putNumber(AUTO_SCORE_TIME_KEY, AUTO_SCORE_TIME.getData());

	}
	
	public static void updateStatus () {
		SmartDashboard.putBoolean(TEST_DI_KEY, Robot.test.getTestDI());
		SmartDashboard.putNumber(TEST_AI_KEY, Robot.test.getTestAI());
		SmartDashboard.putNumber(GYRO_ANGLE_KEY, Robot.lateralDrivetrain.getGyroAngle());
		
		ARCADE_JOYSTICK_X_SENSITIVITY_FACTOR.setData(SmartDashboard.getNumber(ARCADE_DRIVE_X_SENSITIVITY_FACTOR_KEY));
		
		autoForwardPower.setData(SmartDashboard.getNumber(AUTO_FORWARD_POWER_KEY));
		AUTO_BACKWARD_POWER.setData(SmartDashboard.getNumber(AUTO_BACKWARD_POWER_KEY));
		AUTO_ROTATE_POWER.setData(SmartDashboard.getNumber(AUTO_ROTATE_POWER_KEY));
		
		AUTO_FORWARD_TIME.setData(SmartDashboard.getNumber(AUTO_FORWARD_TIME_KEY));
		AUTO_BACKWARD_TIME.setData(SmartDashboard.getNumber(AUTO_BACKWARD_TIME_KEY));
		AUTO_ROTATE_TIME.setData(SmartDashboard.getNumber(AUTO_ROTATE_TIME_KEY));
		
		PICKUP_FORWARD_TIME.setData(SmartDashboard.getNumber(PICKUP_FORWARD_TIME_KEY));
		PICKUP_BACKWARD_TIME.setData(SmartDashboard.getNumber(PICKUP_BACKWARD_TIME_KEY));
		PICKUP_TIME.setData(SmartDashboard.getNumber(PICKUP_TIME_KEY));
		PICKUP_ROTATE_TIME.setData(SmartDashboard.getNumber(PICKUP_ROTATE_TIME_KEY));
		
		AUTO_NEXT_TOTE_TIME.setData(SmartDashboard.getNumber(AUTO_NEXT_TOTE_TIME_KEY));
		AUTO_NEXT_TOTE_ROTATE_TIME.setData(SmartDashboard.getNumber(AUTO_NEXT_TOTE_ROTATE_TIME_KEY));
		
		AUTO_SCORE_TIME.setData(SmartDashboard.getNumber(AUTO_SCORE_TIME_KEY));

	}
}
