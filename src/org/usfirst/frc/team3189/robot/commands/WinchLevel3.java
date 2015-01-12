package org.usfirst.frc.team3189.robot.commands;

import org.usfirst.frc.team3189.robot.Robot;
import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class WinchLevel3 extends Command {

    public WinchLevel3() {
        requires(Robot.winch);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.winch.getPotRotation() > Variables.potentiometerLevelInterval.getData()*3){
    		Robot.winch.setSpeed(Variables.winchDownSpeed.getData());
    	} else {
    		Robot.winch.setSpeed(Variables.winchUpSpeed.getData());
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return Robot.winch.getPotRotation() >= Variables.potentiometerLevelInterval.getData()*3 - Variables.potentiometerTolerance.getData() &&
    			Robot.winch.getPotRotation() <= Variables.potentiometerLevelInterval.getData()*3 + Variables.potentiometerTolerance.getData();
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
