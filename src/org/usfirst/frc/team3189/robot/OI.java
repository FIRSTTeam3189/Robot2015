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
	private Button extendLifterPneumaticsButton = new JoystickButton(joystick, OIMap.buttonExtend);
	private Button retractLifterPneumaticsButton = new JoystickButton(joystick, OIMap.buttonRetract);
	private Button toggleLifterPneumaticsButton = new JoystickButton(joystick, OIMap.buttonToggle);
	
	// Auto and reset buttons
	private Button autoCommandButton = new JoystickButton(joystick, OIMap.buttonAuto);
	private Button resetButtonsButton = new JoystickButton(joystick, OIMap.buttonReset);
	
	// Auto next tote buttons
	private Button autoNextToteForwardButton = new JoystickButton(joystick, OIMap.buttonNextToteForward);
	private Button autoNextToteRotateButton = new JoystickButton(joystick, OIMap.buttonNextToteRotate);
	
	// Auto pickup buttons
	private Button autoPickupForwardButton = new JoystickButton(joystick, OIMap.buttonPickupForward);
	private Button autoPickupBackwardButton = new JoystickButton(joystick, OIMap.buttonPickupBack);
	private Button autoPickupRotateButton = new JoystickButton(joystick, OIMap.buttonPickupRotate);
	
	
	public OI() {
		this.resetButtons();
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
	
	public void resetButtons(){
		// Teleop Buttons
		extendLifterPneumaticsButton.whenPressed(new SetLifterPistonState(true));
		retractLifterPneumaticsButton.whenPressed(new SetLifterPistonState(false));
		toggleLifterPneumaticsButton.whenPressed(new ToggleLifterPistonState());
		
		// Auto command and reset
		autoCommandButton.whenPressed(new Autonomous());
		resetButtonsButton.whenPressed(new ResetButtonsCommand());
		
		// Auto next tote buttons
		autoNextToteForwardButton.whenPressed(new AutoNextTote());
		autoNextToteRotateButton.whenPressed(new AutoRotate(Variables.AUTO_NEXT_TOTE_ROTATE_TIME, false));
		
		// Auto pickup buttons
		autoPickupForwardButton.whenPressed(new AutoForward(Variables.PICKUP_FORWARD_TIME));
		autoPickupBackwardButton.whenPressed(new AutoBackward(Variables.PICKUP_BACKWARD_TIME));
		autoPickupRotateButton.whenPressed(new AutoRotate(Variables.PICKUP_ROTATE_TIME, true));	
	}
}

