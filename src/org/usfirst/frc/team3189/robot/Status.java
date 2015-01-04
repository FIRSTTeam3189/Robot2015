package org.usfirst.frc.team3189.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Status {
	
	public static final String TEST_DI_KEY = "Test Digital Input";
	
	public static void initStatus () {
		
	}
	
	public static void updateStatus () {
		SmartDashboard.putBoolean(TEST_DI_KEY, Robot.test.getTestDI());
	}

}
