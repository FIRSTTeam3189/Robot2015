package org.usfirst.frc.team3189.robot.utility;

import edu.wpi.first.wpilibj.Preferences;

public class Prefs {
	
	public static Preferences robotPreferences;
	public static boolean isMichaelCool = true;
	
	public static void initPreferences () {
		isMichaelCool = Preferences.getInstance().getBoolean("isMichaelCool", true);
//				.getBoolean("isMichaelCool", true);
	}

}
