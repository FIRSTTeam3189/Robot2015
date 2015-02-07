package org.usfirst.frc.team3189.robot.utility;

import org.usfirst.frc.team3189.robot.Status;

import edu.wpi.first.wpilibj.Preferences;

public class Prefs {
	
	public static boolean isMichaelCool = true;
	
	public static void initPreferences () {
		isMichaelCool = Preferences.getInstance().getBoolean("isMichaelCool", true);
//				.getBoolean("isMichaelCool", true);
		Variables.autoScoreTime.set(Preferences.getInstance().getDouble(Status.AUTO_SCORE_TIME_KEY, 7));
	}

}
