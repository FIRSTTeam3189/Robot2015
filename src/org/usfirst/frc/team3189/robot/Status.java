package org.usfirst.frc.team3189.robot;

import static org.usfirst.frc.team3189.robot.utility.Variables.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Status {
	// Sonar vars
	public static final String SONAR_DISTANCE_MULTIPLIER_KEY = "Sonar Distance Multiplier";
	public static final String SONAR_PERCIEVED_DISTANCE_KEY = "Sonar Percieved Distance";
	public static final String SONAR_IN_RANGE_IN_INCHES = "Sonar In Range In Inches";
	
	public static final String POTENTIOMETER_ROTATION_KEY = "Potentiometer Rotation";
	public static final String POTENTIOMETER_LEVEL_INTERVAL_KEY = "Potentiometer Level Interval";
	public static final String POTENTIOMETER_TOLERANCE_KEY = "Potentiometer Tolerance";
	
	// Arm Speeds
	public static final String FORK_CLOSE_SPEED_KEY  = "Fork Close Speed";
	public static final String FORK_OPEN_SPEED_KEY   = "Fork Open Speed";
	public static final String FORK_SPEED_KEY = "Fork Speed";
	public static final String FORK_SLOW_SPEED_KEY = "Fork Slow Speed";
	public static final String FORK_STOP_LIMIT_KEY = "Fork Stopped";
	public static final String FORK_SLOW_LIMIT_KEY = "Fork Slowed";
	public static final String FORK_CURRENT_SPEED_KEY = "Fork Current Speed";
	public static final String WINCH_UP_SPEED_KEY    = "Winch Up Speed";
	public static final String WINCH_DOWN_SPEED_KEY  = "Winch Down Speed";
	public static final String ARM_EXTEND_SPEED_KEY  = "Arm Extend Speed";
	public static final String ARM_RETRACT_SPEED_KEY = "Arm Retract Speed";
	
	public static final String GYRO_ANGLE_KEY = "Gyro Angle";
	public static final String ACCEL_X_KEY = "Accel X";
	public static final String H_DRIVE_FIXED_LEFT = "H-Drive Fixed Left";
	public static final String H_DRIVE_FIXED_RIGHT = "H-Drive Fixed Right";
	
	
	public static final String ARCADE_DRIVE_X_SENSITIVITY_FACTOR_KEY = "Arcade Drive X Sensitivity Factor";
	public static final String TANK_DRIVE_RIGHT_POWER_FACTOR_KEY = "Tank Drive Right Power Factor";
	public static final String DRIVETRAIN_INCREMENT = "Drivetrian Increment";
	
	// Autonomous power vars
	public static final String AUTO_FORWARD_POWER_KEY = "Autonomous Forward Power";
	public static final String AUTO_BACKWARD_POWER_KEY = "Autonomous Backward Power";
	public static final String AUTO_ROTATE_POWER_KEY = "Autonomous Rotate Power";
	public static final String AUTO_SIDEWAYS_POWER_KEY = "Autonomous Sideways Power";
	
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
		SmartDashboard.putNumber(SONAR_DISTANCE_MULTIPLIER_KEY, sonarDistanceMultiplier.get());
		SmartDashboard.putNumber(SONAR_IN_RANGE_IN_INCHES, sonarInRangeInInches.get());
		
		SmartDashboard.putNumber(POTENTIOMETER_LEVEL_INTERVAL_KEY, potentiometerLevelInterval.get());
		SmartDashboard.putNumber(POTENTIOMETER_TOLERANCE_KEY, potentiometerTolerance.get());
		
		SmartDashboard.putNumber(FORK_CLOSE_SPEED_KEY, forkCloseSpeed.get());
		SmartDashboard.putNumber(FORK_OPEN_SPEED_KEY, forkOpenSpeed.get());
		SmartDashboard.putNumber(FORK_SPEED_KEY, forkSpeed.get());
		SmartDashboard.putNumber(FORK_SLOW_SPEED_KEY, forkSlowSpeed.get());
		SmartDashboard.putNumber(WINCH_UP_SPEED_KEY, winchUpSpeed.get());
		SmartDashboard.putNumber(WINCH_DOWN_SPEED_KEY, winchDownSpeed.get());
		SmartDashboard.putNumber(ARM_EXTEND_SPEED_KEY, armExtendSpeed.get());
		SmartDashboard.putNumber(ARM_RETRACT_SPEED_KEY, armRetractSpeed.get());
		
		SmartDashboard.putNumber(ARCADE_DRIVE_X_SENSITIVITY_FACTOR_KEY, arcadeJoystickXSensitivityFactor.get());
		SmartDashboard.putNumber(TANK_DRIVE_RIGHT_POWER_FACTOR_KEY, tankDriveRightPowerFactor.get());
		SmartDashboard.putNumber(DRIVETRAIN_INCREMENT, drivetrainIncrement.get());
		
		SmartDashboard.putNumber(AUTO_FORWARD_POWER_KEY, autoForwardPower.get());
		SmartDashboard.putNumber(AUTO_BACKWARD_POWER_KEY, autoBackwardPower.get());
		SmartDashboard.putNumber(AUTO_ROTATE_POWER_KEY, autoRotatePower.get());
		SmartDashboard.putNumber(AUTO_SIDEWAYS_POWER_KEY, autoSidewaysPower.get());
		
		SmartDashboard.putNumber(AUTO_FORWARD_TIME_KEY, autoForwardTime.get());
		SmartDashboard.putNumber(AUTO_BACKWARD_TIME_KEY, autoBackwardTime.get());
		SmartDashboard.putNumber(AUTO_ROTATE_TIME_KEY, autoRotateTime.get());
		
		SmartDashboard.putNumber(PICKUP_FORWARD_TIME_KEY, autoPickupForwardTime.get());
		SmartDashboard.putNumber(PICKUP_BACKWARD_TIME_KEY, autoPickupBackwardTime.get());
		SmartDashboard.putNumber(PICKUP_TIME_KEY, autoPickupTime.get());
		SmartDashboard.putNumber(PICKUP_ROTATE_TIME_KEY, autoPickupRotateTime.get());
		
		SmartDashboard.putNumber(AUTO_NEXT_TOTE_TIME_KEY, autoNextToteTime.get());
		SmartDashboard.putNumber(AUTO_NEXT_TOTE_ROTATE_TIME_KEY, autoNextToteRotateTime.get());
		
		SmartDashboard.putNumber(AUTO_SCORE_TIME_KEY, autoScoreTime.get());
	}
	
	public static void updateStatus () {
		SmartDashboard.putNumber(SONAR_PERCIEVED_DISTANCE_KEY, Robot.lateralDrivetrain.getSonarDistance());
		SmartDashboard.putData(Robot.forks);
		SmartDashboard.putBoolean(FORK_STOP_LIMIT_KEY, Robot.forks.getStopped());
		SmartDashboard.putBoolean(FORK_SLOW_LIMIT_KEY, Robot.forks.getSlowed());
		SmartDashboard.putNumber(FORK_CURRENT_SPEED_KEY, Robot.forks.getMotorSpeed());
		SmartDashboard.putNumber(POTENTIOMETER_ROTATION_KEY, Robot.winch.getPotRotation());
		SmartDashboard.putNumber(GYRO_ANGLE_KEY, Robot.longDrivetrain.getGyroAngle());
		SmartDashboard.putNumber(ACCEL_X_KEY, Robot.longDrivetrain.getAccelX());
		SmartDashboard.putNumber(H_DRIVE_FIXED_LEFT, Robot.longDrivetrain.getHDriveFixedSpeed(true));
		SmartDashboard.putNumber(H_DRIVE_FIXED_RIGHT, Robot.longDrivetrain.getHDriveFixedSpeed(true));
		
		potentiometerLevelInterval.set(SmartDashboard.getNumber(POTENTIOMETER_LEVEL_INTERVAL_KEY));
		potentiometerTolerance.set(SmartDashboard.getNumber(POTENTIOMETER_TOLERANCE_KEY));
		
		sonarDistanceMultiplier.set(SmartDashboard.getNumber(SONAR_DISTANCE_MULTIPLIER_KEY, sonarDistanceMultiplier.get()));
		sonarInRangeInInches.set(SmartDashboard.getNumber(SONAR_IN_RANGE_IN_INCHES, sonarDistanceMultiplier.get()));
		
		forkCloseSpeed.set(SmartDashboard.getNumber(FORK_CLOSE_SPEED_KEY));
		forkOpenSpeed.set(SmartDashboard.getNumber(FORK_OPEN_SPEED_KEY));
		forkSpeed.set(SmartDashboard.getNumber(FORK_SPEED_KEY));
		forkSlowSpeed.set(SmartDashboard.getNumber(FORK_SLOW_SPEED_KEY));
		winchUpSpeed.set(SmartDashboard.getNumber(WINCH_UP_SPEED_KEY));
		winchDownSpeed.set(SmartDashboard.getNumber(WINCH_DOWN_SPEED_KEY));
		armExtendSpeed.set(SmartDashboard.getNumber(ARM_EXTEND_SPEED_KEY));
		armRetractSpeed.set(SmartDashboard.getNumber(ARM_RETRACT_SPEED_KEY));
		
		arcadeJoystickXSensitivityFactor.set(SmartDashboard.getNumber(ARCADE_DRIVE_X_SENSITIVITY_FACTOR_KEY));
		tankDriveRightPowerFactor.set(SmartDashboard.getNumber(TANK_DRIVE_RIGHT_POWER_FACTOR_KEY));
		drivetrainIncrement.set(SmartDashboard.getNumber(DRIVETRAIN_INCREMENT));
		
		autoForwardPower.set(SmartDashboard.getNumber(AUTO_FORWARD_POWER_KEY));
		autoBackwardPower.set(SmartDashboard.getNumber(AUTO_BACKWARD_POWER_KEY));
		autoRotatePower.set(SmartDashboard.getNumber(AUTO_ROTATE_POWER_KEY));
		autoSidewaysPower.set(SmartDashboard.getNumber(AUTO_SIDEWAYS_POWER_KEY));
		
		autoForwardTime.set(SmartDashboard.getNumber(AUTO_FORWARD_TIME_KEY));
		autoBackwardTime.set(SmartDashboard.getNumber(AUTO_BACKWARD_TIME_KEY));
		autoRotateTime.set(SmartDashboard.getNumber(AUTO_ROTATE_TIME_KEY));
		
		autoPickupForwardTime.set(SmartDashboard.getNumber(PICKUP_FORWARD_TIME_KEY));
		autoPickupBackwardTime.set(SmartDashboard.getNumber(PICKUP_BACKWARD_TIME_KEY));
		autoPickupTime.set(SmartDashboard.getNumber(PICKUP_TIME_KEY));
		autoPickupRotateTime.set(SmartDashboard.getNumber(PICKUP_ROTATE_TIME_KEY));
		
		autoNextToteTime.set(SmartDashboard.getNumber(AUTO_NEXT_TOTE_TIME_KEY));
		autoNextToteRotateTime.set(SmartDashboard.getNumber(AUTO_NEXT_TOTE_ROTATE_TIME_KEY));
		
		autoScoreTime.set(SmartDashboard.getNumber(AUTO_SCORE_TIME_KEY));
	}
}
