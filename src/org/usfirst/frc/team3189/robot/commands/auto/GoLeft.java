package org.usfirst.frc.team3189.robot.commands.auto;

import org.usfirst.frc.team3189.robot.Robot;
import org.usfirst.frc.team3189.robot.utility.ValueReference;
import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GoLeft extends Command {
	private ValueReference<Double> timeout;
	
    public GoLeft(ValueReference<Double> time) {
        requires(Robot.lateralDrivetrain);
        timeout = time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(timeout.get());
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.lateralDrivetrain.move(-Variables.autoRightSpeed.get());;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.lateralDrivetrain.murder();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.lateralDrivetrain.murder();
    }
}
