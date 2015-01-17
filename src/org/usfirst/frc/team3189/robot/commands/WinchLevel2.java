package org.usfirst.frc.team3189.robot.commands;

import org.usfirst.frc.team3189.robot.Robot;
import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class WinchLevel2 extends Command {

    public WinchLevel2() {
        requires(Robot.winch);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.winch.getPotRotation() > Variables.potentiometerLevelInterval.get()*2){
    		Robot.winch.setSpeed(Variables.winchDownSpeed.get());
    	} else {
    		Robot.winch.setSpeed(Variables.winchUpSpeed.get());
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return Robot.winch.getPotRotation() >= Variables.potentiometerLevelInterval.get()*2 - Variables.potentiometerTolerance.get() &&
    			Robot.winch.getPotRotation() <= Variables.potentiometerLevelInterval.get()*2 + Variables.potentiometerTolerance.get();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.winch.kill();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.winch.kill();
    }
}
