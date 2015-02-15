package org.usfirst.frc.team3189.robot;

import static org.usfirst.frc.team3189.robot.utility.Variables.arcadeJoystickXSensitivityFactor;
import static org.usfirst.frc.team3189.robot.utility.Variables.armExtendSpeed;
import static org.usfirst.frc.team3189.robot.utility.Variables.armRetractSpeed;
import static org.usfirst.frc.team3189.robot.utility.Variables.drivetrainIncrement;
import static org.usfirst.frc.team3189.robot.utility.Variables.forkBackwardLimit;
import static org.usfirst.frc.team3189.robot.utility.Variables.forkExtendSpeed;
import static org.usfirst.frc.team3189.robot.utility.Variables.forkForwardLimit;
import static org.usfirst.frc.team3189.robot.utility.Variables.forkRetractSpeed;
import static org.usfirst.frc.team3189.robot.utility.Variables.potentiometerLevelInterval;
import static org.usfirst.frc.team3189.robot.utility.Variables.potentiometerTolerance;
import static org.usfirst.frc.team3189.robot.utility.Variables.tankDriveRightPowerFactor;
import static org.usfirst.frc.team3189.robot.utility.Variables.winchDownSpeed;
import static org.usfirst.frc.team3189.robot.utility.Variables.winchMovingUp;
import static org.usfirst.frc.team3189.robot.utility.Variables.winchUpSpeed;
import static org.usfirst.frc.team3189.robot.utility.Variables.winchUpLevelTime;
import static org.usfirst.frc.team3189.robot.utility.Variables.winchDownLevelTime;
import static org.usfirst.frc.team3189.robot.utility.Variables.winchUpScaler;
import static org.usfirst.frc.team3189.robot.utility.Variables.winchDownScaler;

import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Status {
	
	public static final String POTENTIOMETER_ROTATION_KEY = "Potentiometer Rotation";
	public static final String POTENTIOMETER_LEVEL_INTERVAL_KEY = "Potentiometer Level Interval";
	public static final String POTENTIOMETER_TOLERANCE_KEY = "Potentiometer Tolerance";
	
	// Arm Speeds
	public static final String FORK_CURRENT_SPEED_KEY = "Fork Current Speed";
	public static final String WINCH_UP_SPEED_KEY    = "Winch Up Speed";
	public static final String WINCH_DOWN_SPEED_KEY  = "Winch Down Speed";
	public static final String ARM_EXTEND_SPEED_KEY  = "Arm Extend Speed";
	public static final String ARM_RETRACT_SPEED_KEY = "Arm Retract Speed";
	
	public static final String GYRO_ANGLE_KEY = "Gyro Angle";
	public static final String H_DRIVE_FIXED_LEFT = "H-Drive Fixed Left";
	public static final String H_DRIVE_FIXED_RIGHT = "H-Drive Fixed Right";
	
	// Arm vars
	public static final String ARM_BACKWARD_LIMIT = "Arm Back Limit";
	public static final String ARM_FORWARD_LIMIT = "Arm Forward Limit";
	public static final String ARM_CLOSE_SPEED = "Arm Close Speed";
	public static final String ARM_OPEN_SPEED = "Arm Open Speed";
	
	public static final String WINCH_UPPER_LIMIT_STATE = "Upper IR State";
	public static final String WINCH_LOWER_LIMIT_STATE = "Lower IR State";
	
	public static final String ARCADE_DRIVE_X_SENSITIVITY_FACTOR_KEY = "Arcade Drive X Sensitivity Factor";
	public static final String TANK_DRIVE_RIGHT_POWER_FACTOR_KEY = "Tank Drive Right Power Factor";
	public static final String DRIVETRAIN_INCREMENT = "Drivetrian Increment";
	
	public static final String MOVING_UP_KEY = "Winch Moving Up";
	
	public static final String WINCH_UP_LEVEL_TIME = "Winch Up Time";
	public static final String WINCH_DOWN_LEVEL_TIME = "Winch Down Time";
	
	public static final String WINCH_UP_SCALAR = "Winch Up Scalar";
	public static final String WINCH_DOWN_SCALAR = "Winch Down Scalar";
	
	// AUTONOMOUS SPEED VARS
	public static final String AUTO_FWD_SPEED_KEY   = "Auto Forward Speed";
	public static final String AUTO_BCKWD_SPEED_KEY = "Auto Backward Speed";
	
	public static final String AUTO_LEFT_SPEED_KEY  = "Auto Left Speed";
	public static final String AUTO_RIGHT_SPEED_KEY = "Auto Right Speed";
	
	public static final String AUTO_TURN_LEFT_SPEED_KEY = "Auto Turn Left Speed";
	public static final String AUTO_TURN_RIGHT_SPEED_KEY = "Auto Turn Right Speed";
	
	// AUTONOMOUS TIME VARS
	public static final String AUTO_GO_FORWARD_TIME_KEY = "Auto Go Forward Time";
	public static final String AUTO_GO_LEFT_TIME_KEY    = "Auto Go Left Time";
	public static final String AUTO_GO_BACKWARD_TIME_KEY = "Auto Go Back Time";
		
	public static void initStatus () {
		SmartDashboard.putNumber(POTENTIOMETER_LEVEL_INTERVAL_KEY, potentiometerLevelInterval.get());
		SmartDashboard.putNumber(POTENTIOMETER_TOLERANCE_KEY, potentiometerTolerance.get());
		
		SmartDashboard.putNumber(WINCH_UP_SPEED_KEY, winchUpSpeed.get());
		SmartDashboard.putNumber(WINCH_DOWN_SPEED_KEY, winchDownSpeed.get());
		SmartDashboard.putNumber(ARM_EXTEND_SPEED_KEY, armExtendSpeed.get());
		SmartDashboard.putNumber(ARM_RETRACT_SPEED_KEY, armRetractSpeed.get());
		
		//Forks Init
		SmartDashboard.putNumber(ARM_BACKWARD_LIMIT, forkBackwardLimit.get());
		SmartDashboard.putNumber(ARM_FORWARD_LIMIT, forkForwardLimit.get());
		SmartDashboard.putNumber(ARM_CLOSE_SPEED, forkExtendSpeed.get());
		SmartDashboard.putNumber(ARM_OPEN_SPEED, forkRetractSpeed.get());
		
		SmartDashboard.putNumber(ARCADE_DRIVE_X_SENSITIVITY_FACTOR_KEY, arcadeJoystickXSensitivityFactor.get());
		SmartDashboard.putNumber(TANK_DRIVE_RIGHT_POWER_FACTOR_KEY, tankDriveRightPowerFactor.get());
		SmartDashboard.putNumber(DRIVETRAIN_INCREMENT, drivetrainIncrement.get());
		
		SmartDashboard.putString(MOVING_UP_KEY, winchMovingUp.get());
		
		SmartDashboard.putNumber(WINCH_UP_LEVEL_TIME, winchUpLevelTime.get());
		SmartDashboard.putNumber(WINCH_DOWN_LEVEL_TIME, winchDownLevelTime.get());
		SmartDashboard.putNumber(WINCH_UP_SCALAR, winchUpScaler.get());
		SmartDashboard.putNumber(WINCH_DOWN_SCALAR, winchDownScaler.get());
		
		
		// AUTONOMOUS SPEED VARS
		SmartDashboard.putNumber(AUTO_FWD_SPEED_KEY, Variables.autoForwardSpeed.get());
		SmartDashboard.putNumber(AUTO_BCKWD_SPEED_KEY, Variables.autoBackwardSpeed.get());
		
		SmartDashboard.putNumber(AUTO_LEFT_SPEED_KEY, Variables.autoBackwardSpeed.get());
		SmartDashboard.putNumber(AUTO_RIGHT_SPEED_KEY, Variables.autoRightSpeed.get());
		
		SmartDashboard.putNumber(AUTO_TURN_LEFT_SPEED_KEY, Variables.autoTurnLeftSpeed.get());
		SmartDashboard.putNumber(AUTO_TURN_RIGHT_SPEED_KEY, Variables.autoTurnRightSpeed.get());
		
		// AUTONOMOUS TIME VARS
		SmartDashboard.putNumber(AUTO_GO_FORWARD_TIME_KEY, Variables.autoGoForwardTime.get());
		SmartDashboard.putNumber(AUTO_GO_LEFT_TIME_KEY, Variables.autoGoLeftTime.get());
		SmartDashboard.putNumber(AUTO_GO_BACKWARD_TIME_KEY, Variables.autoGoBackwardTime.get());
	}
	
	public static void updateStatus () {
		SmartDashboard.putData(Robot.forks);
		SmartDashboard.putData(Robot.lateralDrivetrain);
		SmartDashboard.putNumber(FORK_CURRENT_SPEED_KEY, Robot.forks.getMotorSpeed());
		SmartDashboard.putNumber(POTENTIOMETER_ROTATION_KEY, Robot.forks.getPotRotation());
		SmartDashboard.putNumber(GYRO_ANGLE_KEY, Robot.longDrivetrain.getGyroAngle());
		SmartDashboard.putNumber(H_DRIVE_FIXED_LEFT, Robot.longDrivetrain.getHDriveFixedSpeed(true));
		SmartDashboard.putNumber(H_DRIVE_FIXED_RIGHT, Robot.longDrivetrain.getHDriveFixedSpeed(true));
		
		winchUpScaler.set(SmartDashboard.getNumber(WINCH_UP_SCALAR));
		winchDownScaler.set(SmartDashboard.getNumber(WINCH_DOWN_SCALAR));
		
		potentiometerLevelInterval.set(SmartDashboard.getNumber(POTENTIOMETER_LEVEL_INTERVAL_KEY));
		potentiometerTolerance.set(SmartDashboard.getNumber(POTENTIOMETER_TOLERANCE_KEY));
		
		winchUpSpeed.set(SmartDashboard.getNumber(WINCH_UP_SPEED_KEY));
		winchDownSpeed.set(SmartDashboard.getNumber(WINCH_DOWN_SPEED_KEY));
		armExtendSpeed.set(SmartDashboard.getNumber(ARM_EXTEND_SPEED_KEY));
		armRetractSpeed.set(SmartDashboard.getNumber(ARM_RETRACT_SPEED_KEY));
		
		// arm update
		forkBackwardLimit.set(SmartDashboard.getNumber(ARM_BACKWARD_LIMIT));
		forkForwardLimit.set(SmartDashboard.getNumber(ARM_FORWARD_LIMIT));
		forkExtendSpeed.set(SmartDashboard.getNumber(ARM_CLOSE_SPEED));
		forkRetractSpeed.set(SmartDashboard.getNumber(ARM_OPEN_SPEED));
		
		SmartDashboard.putBoolean(WINCH_UPPER_LIMIT_STATE, Robot.winch.getUpperState());
		SmartDashboard.putBoolean(WINCH_LOWER_LIMIT_STATE, Robot.winch.getLowerState());
		
		arcadeJoystickXSensitivityFactor.set(SmartDashboard.getNumber(ARCADE_DRIVE_X_SENSITIVITY_FACTOR_KEY));
		tankDriveRightPowerFactor.set(SmartDashboard.getNumber(TANK_DRIVE_RIGHT_POWER_FACTOR_KEY));
		drivetrainIncrement.set(SmartDashboard.getNumber(DRIVETRAIN_INCREMENT));
		
		SmartDashboard.putString(MOVING_UP_KEY, winchMovingUp.get());
		winchUpLevelTime.set(SmartDashboard.getNumber(WINCH_UP_LEVEL_TIME));
		winchDownLevelTime.set(SmartDashboard.getNumber(WINCH_DOWN_LEVEL_TIME));
		
		
		// AUTONOMOUS SPEED VARS
		Variables.autoForwardSpeed.set(SmartDashboard.getNumber(AUTO_FWD_SPEED_KEY));
		Variables.autoBackwardSpeed.set(SmartDashboard.getNumber(AUTO_BCKWD_SPEED_KEY));
		
		Variables.autoLeftSpeed.set(SmartDashboard.getNumber(AUTO_LEFT_SPEED_KEY));
		Variables.autoRightSpeed.set(SmartDashboard.getNumber(AUTO_RIGHT_SPEED_KEY));
		
		Variables.autoTurnLeftSpeed.set(SmartDashboard.getNumber(AUTO_TURN_LEFT_SPEED_KEY));
		Variables.autoTurnRightSpeed.set(SmartDashboard.getNumber(AUTO_TURN_RIGHT_SPEED_KEY));
		
		// AUTONOMOUS TIME VARS
		Variables.autoGoForwardTime.set(SmartDashboard.getNumber(AUTO_GO_FORWARD_TIME_KEY));
		Variables.autoGoLeftTime.set(SmartDashboard.getNumber(AUTO_GO_LEFT_TIME_KEY));
		Variables.autoGoBackwardTime.set(SmartDashboard.getNumber(AUTO_GO_BACKWARD_TIME_KEY));
	}
}
