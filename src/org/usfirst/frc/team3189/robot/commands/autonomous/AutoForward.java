package org.usfirst.frc.team3189.robot.commands.autonomous;

import org.usfirst.frc.team3189.robot.Robot;
import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoForward extends Command {
	private double time;
    public AutoForward(double duration) {
    	requires(Robot.longDrivetrain);
    	time = duration;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(time);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.longDrivetrain.tankDrive(Variables.AUTO_FORWARD_POWER, Variables.AUTO_FORWARD_POWER);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.longDrivetrain.kill();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.longDrivetrain.kill();
    }
}
