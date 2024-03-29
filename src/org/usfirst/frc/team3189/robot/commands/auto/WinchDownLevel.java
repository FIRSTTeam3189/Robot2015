package org.usfirst.frc.team3189.robot.commands.auto;

import org.usfirst.frc.team3189.robot.Robot;
import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class WinchDownLevel extends Command {

    public WinchDownLevel() {
        requires(Robot.winch);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(Robot.winch.getScaledDownTime());
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.winch.setSpeed(Variables.winchDownSpeed.get());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.winch.kill();
    	Robot.winch.downLevel();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.winch.kill();
    }
}
