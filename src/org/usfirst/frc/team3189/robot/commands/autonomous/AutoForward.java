package org.usfirst.frc.team3189.robot.commands.autonomous;

import org.usfirst.frc.team3189.robot.Robot;
import org.usfirst.frc.team3189.robot.utility.ValueReference;
import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoForward extends Command {
	private ValueReference<Double> time;
    public AutoForward(ValueReference<Double> duration) {
    	requires(Robot.longDrivetrain);
    	time = duration;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(time.getData());
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.longDrivetrain.tankDrive(Variables.autoForwardPower.getData(), Variables.autoForwardPower.getData(), Variables.tankDriveRightPowerFactor.getData());
    	
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
