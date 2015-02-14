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
        Variables.winchMovingUp.set("Construct Command");
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Variables.winchMovingUp.set("Init Command");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Variables.winchMovingUp.set("Exec Command");
    	Robot.winch.moveToTop();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return !Robot.winch.getUpperState();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.winch.kill();
    	Variables.winchMovingUp.set("End Cmmnd");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.winch.kill();
    }
}
