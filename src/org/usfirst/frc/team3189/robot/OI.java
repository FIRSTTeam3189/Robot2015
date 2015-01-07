package org.usfirst.frc.team3189.robot;

import org.usfirst.frc.team3189.robot.commands.ResetButtonsCommand;
import org.usfirst.frc.team3189.robot.commands.SetLifterPistonState;
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
	
	private Joystick joystick = new Joystick(OIMap.joystickChannel);

	// Teleop Buttons
	private Button extendLifterPneumaticsButton;
	private Button retractLifterPneumaticsButton;
	private Button toggleLifterPneumaticsButton;
	
	// Auto and reset buttons
	private Button autoCommandButton;
	private Button resetButtonsButton;
	
	// Auto next tote buttons
	private Button autoNextToteForwardButton;
	private Button autoNextToteRotateButton;
	
	// Auto pickup buttons
	private Button autoPickupForwardButton;
	private Button autoPickupBackwardButton;
	private Button autoPickupRotateButton;
	
	
	public OI() {
		this.initButtons();
	}
	
	public Joystick getJoystick() {
		return joystick;
	}
	
	public double getJoystickY () {
		return joystick.getY();
	}
	
	public double getJoystickX() {
		return joystick.getX();
	}
	
	public void initButtons(){
		// Teleop Buttons
		extendLifterPneumaticsButton = new JoystickButton(joystick, OIMap.buttonExtend);
		retractLifterPneumaticsButton = new JoystickButton(joystick, OIMap.buttonRetract);
		toggleLifterPneumaticsButton = new JoystickButton(joystick, OIMap.buttonToggle);
		
		// Autonomous command button
		autoCommandButton = new JoystickButton(joystick, OIMap.buttonAuto);
		
		// Auto next tote buttons
		autoNextToteForwardButton = new JoystickButton(joystick, OIMap.buttonNextToteForward);
		autoNextToteRotateButton = new JoystickButton(joystick, OIMap.buttonNextToteRotate);
		
		// Auto pickup buttons
		autoPickupForwardButton = new JoystickButton(joystick, OIMap.buttonPickupForward);
		autoPickupBackwardButton = new JoystickButton(joystick, OIMap.buttonPickupBackward);
		autoPickupRotateButton = new JoystickButton(joystick, OIMap.buttonPickupRotate);
		
		// Teleop Buttons
		extendLifterPneumaticsButton.whenPressed(new SetLifterPistonState(true));
		retractLifterPneumaticsButton.whenPressed(new SetLifterPistonState(false));
		toggleLifterPneumaticsButton.whenPressed(new ToggleLifterPistonState());
		
		// Auto command and reset
		autoCommandButton.whenPressed(new Autonomous());
		resetButtonsButton.whenPressed(new ResetButtonsCommand());
		
		// Auto next tote buttons
		autoNextToteForwardButton.whenPressed(new AutoNextTote());
		autoNextToteRotateButton.whenPressed(new AutoRotate(Variables.autoNextToteRotateTime, false));
		
		// Auto pickup buttons
		autoPickupForwardButton.whenPressed(new AutoForward(Variables.autoPickupForwardTime));
		autoPickupBackwardButton.whenPressed(new AutoBackward(Variables.autoPickupBackwardTime));
		autoPickupRotateButton.whenPressed(new AutoRotate(Variables.autoPickupRotateTime, true));	
	}
}

