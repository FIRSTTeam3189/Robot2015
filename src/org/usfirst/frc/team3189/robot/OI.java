package org.usfirst.frc.team3189.robot;

import org.usfirst.frc.team3189.robot.commands.ExtendForks;
import org.usfirst.frc.team3189.robot.commands.ForkManualControl;
import org.usfirst.frc.team3189.robot.commands.GripperExtend;
import org.usfirst.frc.team3189.robot.commands.GripperRetract;
import org.usfirst.frc.team3189.robot.commands.RetractForks;
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
	
	private Joystick mainJoystick = new Joystick(OIMap.mainJoystickChannel);
	private Joystick rotationalJoystick = new Joystick(OIMap.rotationalJoystickChannel);
	private Joystick winchJoystick = new Joystick(OIMap.winchJoystickChannel);

	//Debug
	private Button debugForwardBackwardButton;
	
	// Teleop Buttons
	private Button extendLifterPneumaticsButton;
	private Button retractLifterPneumaticsButton;
	private Button toggleLifterPneumaticsButton;
	
	private Button openForksButton;
	private Button closeForksButton;
	private Button manualForksButton;
	
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
	
	// Gripper
	private Button gripperExtend;
	private Button gripperRetract;
	
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
		// Instantiation
		// Debug buttons
		//debugForwardBackwardButton = new JoystickButton(winchJoystick, 5);
		// Teleop Buttons
		extendLifterPneumaticsButton = new JoystickButton(mainJoystick, OIMap.buttonExtend);
		retractLifterPneumaticsButton = new JoystickButton(mainJoystick, OIMap.buttonRetract);
		toggleLifterPneumaticsButton = new JoystickButton(mainJoystick, OIMap.buttonToggle);
		
		openForksButton  = new JoystickButton(winchJoystick, OIMap.buttonOpenForks);
		closeForksButton = new JoystickButton(winchJoystick, OIMap.buttonCloseForks);
		manualForksButton = new JoystickButton(winchJoystick, OIMap.buttonManualForks);
		
		// Autonomous command button
		autoCommandButton = new JoystickButton(mainJoystick, OIMap.buttonAuto);
		
		// Auto next tote buttons
		autoNextToteForwardButton = new JoystickButton(mainJoystick, OIMap.buttonNextToteForward);
		autoNextToteRotateButton = new JoystickButton(mainJoystick, OIMap.buttonNextToteRotate);
		
		// Auto pickup buttons
		autoPickupForwardButton = new JoystickButton(mainJoystick, OIMap.buttonPickupForward);
		autoPickupBackwardButton = new JoystickButton(mainJoystick, OIMap.buttonPickupBackward);
		autoPickupRotateButton = new JoystickButton(mainJoystick, OIMap.buttonPickupRotate);
		
		// Gripper
		gripperExtend  = new JoystickButton(winchJoystick, OIMap.buttonExtendGripper);
		gripperRetract = new JoystickButton(winchJoystick, OIMap.buttonRetractGripper);
		
		// Set Functionality
		//debugForwardBackwardButton.whenPressed(new DebugMovement());
		// Teleop Buttons
		extendLifterPneumaticsButton.whenPressed(new SetLifterPistonState(true));
		retractLifterPneumaticsButton.whenPressed(new SetLifterPistonState(false));
		toggleLifterPneumaticsButton.whenPressed(new ToggleLifterPistonState());
		
		openForksButton.whileHeld(new ExtendForks());
		closeForksButton.whileHeld(new RetractForks());
		manualForksButton.whenPressed(new ForkManualControl());
		
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
		
		gripperExtend.whenPressed(new GripperExtend());
		gripperRetract.whenPressed(new GripperRetract());
		
	}
}

