package org.usfirst.frc.team3189.robot.commands.autonomous;

import org.usfirst.frc.team3189.robot.Robot;
import org.usfirst.frc.team3189.robot.utility.Variables;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoSidewaysLeft extends Command {

    public AutoSidewaysLeft() {
        requires(Robot.lateralDrivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.lateralDrivetrain.move(-Variables.autoSidewaysPower.getData());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.lateralDrivetrain.getSonarDistance() < Variables.sonarInRangeInInches.getData();
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
