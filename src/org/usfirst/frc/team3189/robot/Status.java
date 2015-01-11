package org.usfirst.frc.team3189.robot;

import static org.usfirst.frc.team3189.robot.utility.Variables.arcadeJoystickXSensitivityFactor;
import static org.usfirst.frc.team3189.robot.utility.Variables.autoBackwardPower;
import static org.usfirst.frc.team3189.robot.utility.Variables.autoBackwardTime;
import static org.usfirst.frc.team3189.robot.utility.Variables.autoForwardPower;
import static org.usfirst.frc.team3189.robot.utility.Variables.autoForwardTime;
import static org.usfirst.frc.team3189.robot.utility.Variables.autoNextToteRotateTime;
import static org.usfirst.frc.team3189.robot.utility.Variables.autoNextToteTime;
import static org.usfirst.frc.team3189.robot.utility.Variables.autoPickupBackwardTime;
import static org.usfirst.frc.team3189.robot.utility.Variables.autoPickupForwardTime;
import static org.usfirst.frc.team3189.robot.utility.Variables.autoPickupRotateTime;
import static org.usfirst.frc.team3189.robot.utility.Variables.autoPickupTime;
import static org.usfirst.frc.team3189.robot.utility.Variables.autoRotatePower;
import static org.usfirst.frc.team3189.robot.utility.Variables.autoRotateTime;
import static org.usfirst.frc.team3189.robot.utility.Variables.autoScoreTime;
import static org.usfirst.frc.team3189.robot.utility.Variables.autoSidewaysPower;
import static org.usfirst.frc.team3189.robot.utility.Variables.sonarDistanceMultiplier;
import static org.usfirst.frc.team3189.robot.utility.Variables.sonarInRangeInInches;
import static org.usfirst.frc.team3189.robot.utility.Variables.forkCloseSpeed;
import static org.usfirst.frc.team3189.robot.utility.Variables.forkOpenSpeed;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Status {
	// Winch speed vars
	public static final String FORK_CLOSE_SPEED_KEY = "Fork Close Speed";
	public static final String FORK_OPEN_SPEED_KEY  = "Fork Open Speed";
	
	public static final String GYRO_ANGLE_KEY = "Gyro Angle";
	
	public static final String ARCADE_DRIVE_X_SENSITIVITY_FACTOR_KEY = "Arcade Drive X Sensitivity Factor";
	
	// Sonar vars
	public static final String SONAR_DISTANCE_MULTIPLIER_KEY = "Sonar Distance Multiplier";
	public static final String SONAR_PERCIEVED_DISTANCE_KEY = "Sonar Percieved Distance";
	public static final String SONAR_IN_RANGE_IN_INCHES = "Sonar In Range In Inches";
	
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
		SmartDashboard.putNumber(FORK_CLOSE_SPEED_KEY, forkCloseSpeed.getData());
		SmartDashboard.putNumber(FORK_OPEN_SPEED_KEY, forkOpenSpeed.getData());
		
		SmartDashboard.putNumber(ARCADE_DRIVE_X_SENSITIVITY_FACTOR_KEY, arcadeJoystickXSensitivityFactor.getData());
		
		SmartDashboard.putNumber(SONAR_DISTANCE_MULTIPLIER_KEY, sonarDistanceMultiplier.getData());
		SmartDashboard.putNumber(SONAR_IN_RANGE_IN_INCHES, sonarInRangeInInches.getData());
		
		SmartDashboard.putNumber(AUTO_FORWARD_POWER_KEY, autoForwardPower.getData());
		SmartDashboard.putNumber(AUTO_BACKWARD_POWER_KEY, autoBackwardPower.getData());
		SmartDashboard.putNumber(AUTO_ROTATE_POWER_KEY, autoRotatePower.getData());
		SmartDashboard.putNumber(AUTO_SIDEWAYS_POWER_KEY, autoSidewaysPower.getData());
		
		SmartDashboard.putNumber(AUTO_FORWARD_TIME_KEY, autoForwardTime.getData());
		SmartDashboard.putNumber(AUTO_BACKWARD_TIME_KEY, autoBackwardTime.getData());
		SmartDashboard.putNumber(AUTO_ROTATE_TIME_KEY, autoRotateTime.getData());
		
		SmartDashboard.putNumber(PICKUP_FORWARD_TIME_KEY, autoPickupForwardTime.getData());
		SmartDashboard.putNumber(PICKUP_BACKWARD_TIME_KEY, autoPickupBackwardTime.getData());
		SmartDashboard.putNumber(PICKUP_TIME_KEY, autoPickupTime.getData());
		SmartDashboard.putNumber(PICKUP_ROTATE_TIME_KEY, autoPickupRotateTime.getData());
		
		SmartDashboard.putNumber(AUTO_NEXT_TOTE_TIME_KEY, autoNextToteTime.getData());
		SmartDashboard.putNumber(AUTO_NEXT_TOTE_ROTATE_TIME_KEY, autoNextToteRotateTime.getData());
		
		SmartDashboard.putNumber(AUTO_SCORE_TIME_KEY, autoScoreTime.getData());
	}
	
	public static void updateStatus () {
		forkCloseSpeed.setData(SmartDashboard.getNumber(FORK_CLOSE_SPEED_KEY));
		forkOpenSpeed.setData(SmartDashboard.getNumber(FORK_OPEN_SPEED_KEY));
		
		SmartDashboard.putNumber(SONAR_PERCIEVED_DISTANCE_KEY, Robot.lateralDrivetrain.getSonarDistance());
		
		arcadeJoystickXSensitivityFactor.setData(SmartDashboard.getNumber(ARCADE_DRIVE_X_SENSITIVITY_FACTOR_KEY));
		
		sonarDistanceMultiplier.setData(SmartDashboard.getNumber(SONAR_DISTANCE_MULTIPLIER_KEY, sonarDistanceMultiplier.getData()));
		sonarInRangeInInches.setData(SmartDashboard.getNumber(SONAR_IN_RANGE_IN_INCHES, sonarDistanceMultiplier.getData()));
		
		autoForwardPower.setData(SmartDashboard.getNumber(AUTO_FORWARD_POWER_KEY));
		autoBackwardPower.setData(SmartDashboard.getNumber(AUTO_BACKWARD_POWER_KEY));
		autoRotatePower.setData(SmartDashboard.getNumber(AUTO_ROTATE_POWER_KEY));
		autoSidewaysPower.setData(SmartDashboard.getNumber(AUTO_SIDEWAYS_POWER_KEY));
		
		autoForwardTime.setData(SmartDashboard.getNumber(AUTO_FORWARD_TIME_KEY));
		autoBackwardTime.setData(SmartDashboard.getNumber(AUTO_BACKWARD_TIME_KEY));
		autoRotateTime.setData(SmartDashboard.getNumber(AUTO_ROTATE_TIME_KEY));
		
		autoPickupForwardTime.setData(SmartDashboard.getNumber(PICKUP_FORWARD_TIME_KEY));
		autoPickupBackwardTime.setData(SmartDashboard.getNumber(PICKUP_BACKWARD_TIME_KEY));
		autoPickupTime.setData(SmartDashboard.getNumber(PICKUP_TIME_KEY));
		autoPickupRotateTime.setData(SmartDashboard.getNumber(PICKUP_ROTATE_TIME_KEY));
		
		autoNextToteTime.setData(SmartDashboard.getNumber(AUTO_NEXT_TOTE_TIME_KEY));
		autoNextToteRotateTime.setData(SmartDashboard.getNumber(AUTO_NEXT_TOTE_ROTATE_TIME_KEY));
		
		autoScoreTime.setData(SmartDashboard.getNumber(AUTO_SCORE_TIME_KEY));
	}
}
