package org.usfirst.frc.team3189.robot;

import org.usfirst.frc.team3189.robot.commands.DrivetrainBackward;
import org.usfirst.frc.team3189.robot.commands.DrivetrainForward;
import org.usfirst.frc.team3189.robot.commands.ForkManualControl;
import org.usfirst.frc.team3189.robot.commands.ForksExtend;
import org.usfirst.frc.team3189.robot.commands.ForksRetract;
import org.usfirst.frc.team3189.robot.commands.WinchControlUp;
import org.usfirst.frc.team3189.robot.commands.WinchControlLeft;
import org.usfirst.frc.team3189.robot.commands.WinchControlRight;
import org.usfirst.frc.team3189.robot.commands.WinchControlDown;
import org.usfirst.frc.team3189.robot.commands.auto.BinAuto;
import org.usfirst.frc.team3189.robot.commands.auto.SimpleAutonomous;
import org.usfirst.frc.team3189.robot.commands.auto.WinchDownLevel;
import org.usfirst.frc.team3189.robot.commands.auto.WinchUpLevel;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	private Joystick mainJoystick = new Joystick(OIMap.mainJoystickChannel);
	private Joystick rotationalJoystick = new Joystick(OIMap.rotationalJoystickChannel);
	private Joystick winchJoystick = new Joystick(OIMap.winchJoystickChannel);

	private Button Joy1But1;
	private Button Joy1But2;
	private Button Joy1But3;
	
	private Button Joy2But10;
	private Button Joy2But11;
	
	private Button Joy3But5;
	private Button Joy3But4;
	private Button Joy3But3;
	private Button Joy3But2;
	private Button Joy3But1;
	
	private Button Joy3But8;
	private Button Joy3But9;
	private Button Joy3But10;
	private Button Joy3But11;
	
	public OI() {
		this.initButtons();
	}
	
	public Joystick getMainJoystick() {
		return mainJoystick;
	}
	
	public double getMainJoystickY () {
		return mainJoystick.getY();
	}
	
	public double getMainJoystickX() {
		return mainJoystick.getX();
	}
	
	public Joystick getRotationalJoystick() {
		return rotationalJoystick;
	}
	
	public double getRotationalJoystickY () {
		return rotationalJoystick.getY();
	}
	
	public double getRotationalJoystickX() {
		return rotationalJoystick.getX();
	}
	
	public Joystick getWinchJoystick() {
		return winchJoystick;
	}
	
	public double getWinchJoystickX() {
		return winchJoystick.getX();
	}
	
	public double getWinchJoystickY() {
		return winchJoystick.getY();
	}
	
	public void initButtons(){
		Joy1But1 = new JoystickButton(mainJoystick, 1);
		Joy1But2 = new JoystickButton(mainJoystick, 2);
		Joy1But3 = new JoystickButton(mainJoystick, 3);
		
		Joy3But5 = new JoystickButton(winchJoystick, 5);
		Joy3But4 = new JoystickButton(winchJoystick, 4);
		Joy3But3  = new JoystickButton(winchJoystick, 3);
		Joy3But2 = new JoystickButton(winchJoystick, 2);
		Joy3But1 = new JoystickButton(winchJoystick, 1);
		
		Joy2But10 = new JoystickButton(rotationalJoystick, 10);
		Joy2But11 = new JoystickButton(rotationalJoystick, 11);
		
		Joy3But8 = new JoystickButton(winchJoystick, 8);
		Joy3But9 = new JoystickButton(winchJoystick, 9);
		Joy3But10 = new JoystickButton(winchJoystick, 10);
		Joy3But11 = new JoystickButton(winchJoystick, 11);
		
		Joy2But10.whenPressed(new SimpleAutonomous());
		Joy2But11.whenPressed(new BinAuto());
		
		Joy1But2.whenPressed(new DrivetrainBackward());
		Joy1But3.whenPressed(new DrivetrainForward());
		
		Joy3But2.whenPressed(new WinchDownLevel());
		Joy3But3.whenPressed(new WinchUpLevel());
		Joy3But4.whenPressed(new ForksRetract());
		Joy3But5.whenPressed(new ForksExtend());
		Joy3But1.whenPressed(new ForkManualControl());
		
		Joy3But8.whileHeld(new WinchControlLeft());
		Joy3But9.whileHeld(new WinchControlRight());
		Joy3But10.whileHeld(new WinchControlDown());
		Joy3But11.whileHeld(new WinchControlUp());
	}
}

