package org.usfirst.frc.team3189.robot;

import org.usfirst.frc.team3189.robot.commands.ResetButtonsCommand;
import org.usfirst.frc.team3189.robot.commands.SetLifterPistonState;
import org.usfirst.frc.team3189.robot.commands.ToggleLifterPistonState;
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
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	private Joystick joystick = new Joystick(OIMap.joystickChannel);

	
	private Button extendLiferPneumaticsButton = new JoystickButton(joystick, OIMap.buttonExtend);
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
	
	public double getLeftY () {
		return joystick.getY();
	}
	
	public double getLeftX() {
		return joystick.getX();
	}
	
	public void resetButtons(){
		extendLiferPneumaticsButton.whenPressed(new SetLifterPistonState(true));
		retractLifterPneumaticsButton.whenPressed(new SetLifterPistonState(false));
		toggleLifterPneumaticsButton.whenPressed(new ToggleLifterPistonState());
		
		// Auto command and reset
		autoCommandButton.whileHeld(new Autonomous());
		resetButtonsButton.whenPressed(new ResetButtonsCommand());
		
		// Auto next tote buttons
		autoNextToteForwardButton.whileHeld(new AutoNextTote());
		autoNextToteRotateButton.whileHeld(new AutoRotate(Variables.AUTO_NEXT_TOTE_ROTATE_TIME, false));
		
		// Auto pickup buttons
		autoPickupForwardButton.whileHeld(new AutoForward(Variables.PICKUP_FORWARD_TIME));
		autoPickupBackwardButton.whileHeld(new AutoForward(Variables.PICKUP_BACKWARD_TIME));
		autoPickupRotateButton.whileHeld(new AutoRotate(Variables.PICKUP_ROTATE_TIME, true));
		
		
	}
	
	
}

