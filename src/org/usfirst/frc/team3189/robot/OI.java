package org.usfirst.frc.team3189.robot;

import org.usfirst.frc.team3189.robot.commands.SetGearCommand;
import org.usfirst.frc.team3189.robot.commands.SetLifterPistonState;
import org.usfirst.frc.team3189.robot.commands.ShiftGearCommand;
import org.usfirst.frc.team3189.robot.commands.ToggleLifterPistonState;
import org.usfirst.frc.team3189.robot.commands.autonomous.AutoBackward;
import org.usfirst.frc.team3189.robot.commands.autonomous.AutoForward;
import org.usfirst.frc.team3189.robot.commands.autonomous.AutoNextTote;
import org.usfirst.frc.team3189.robot.commands.autonomous.AutoRotate;
import org.usfirst.frc.team3189.robot.commands.autonomous.Autonomous;
import org.usfirst.frc.team3189.robot.utility.Variables;

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

	// Teleop Buttons
	private Button extendLifterPneumaticsButton;
	private Button retractLifterPneumaticsButton;
	private Button toggleLifterPneumaticsButton;
	
	// Auto and reset buttons
	private Button autoCommandButton;
	
	// Auto next tote buttons
	private Button autoNextToteForwardButton;
	private Button autoNextToteRotateButton;
	
	// Auto pickup buttons
	private Button autoPickupForwardButton;
	private Button autoPickupBackwardButton;
	private Button autoPickupRotateButton;
	
	// Gearbox
	private Button gear1;
	private Button gear2;
	private Button toggleGears;
	
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
	
	public void initButtons(){
		// Instantiation
		
		// Teleop Buttons
		extendLifterPneumaticsButton = new JoystickButton(mainJoystick, OIMap.buttonExtend);
		retractLifterPneumaticsButton = new JoystickButton(mainJoystick, OIMap.buttonRetract);
		toggleLifterPneumaticsButton = new JoystickButton(mainJoystick, OIMap.buttonToggle);
		
		// Autonomous command button
		autoCommandButton = new JoystickButton(mainJoystick, OIMap.buttonAuto);
		
		// Auto next tote buttons
		autoNextToteForwardButton = new JoystickButton(mainJoystick, OIMap.buttonNextToteForward);
		autoNextToteRotateButton = new JoystickButton(mainJoystick, OIMap.buttonNextToteRotate);
		
		// Auto pickup buttons
		autoPickupForwardButton = new JoystickButton(mainJoystick, OIMap.buttonPickupForward);
		autoPickupBackwardButton = new JoystickButton(mainJoystick, OIMap.buttonPickupBackward);
		autoPickupRotateButton = new JoystickButton(mainJoystick, OIMap.buttonPickupRotate);
		
		// Gearbox
		gear1 = new JoystickButton(rotationalJoystick, OIMap.buttonGear1);
		gear2 = new JoystickButton(rotationalJoystick, OIMap.buttonGear2);
		toggleGears = new JoystickButton(rotationalJoystick, OIMap.buttonToggleGears);
		
		// Set Functionality
		
		// Teleop Buttons
		extendLifterPneumaticsButton.whenPressed(new SetLifterPistonState(true));
		retractLifterPneumaticsButton.whenPressed(new SetLifterPistonState(false));
		toggleLifterPneumaticsButton.whenPressed(new ToggleLifterPistonState());
		
		// Auto command and reset
		autoCommandButton.whenPressed(new Autonomous());
		
		// Auto next tote buttons
		autoNextToteForwardButton.whenPressed(new AutoNextTote());
		autoNextToteRotateButton.whenPressed(new AutoRotate(Variables.autoNextToteRotateTime, false));
		
		// Auto pickup buttons
		autoPickupForwardButton.whenPressed(new AutoForward(Variables.autoPickupForwardTime));
		autoPickupBackwardButton.whenPressed(new AutoBackward(Variables.autoPickupBackwardTime));
		autoPickupRotateButton.whenPressed(new AutoRotate(Variables.autoPickupRotateTime, true));
		
		// Gearbox
//		gear1.whenPressed(new SetGearCommand(false));
//		gear2.whenPressed(new SetGearCommand(true));
//		toggleGears.whenPressed(new ShiftGearCommand());
	}
}

