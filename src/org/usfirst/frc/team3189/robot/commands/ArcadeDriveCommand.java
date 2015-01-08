
package org.usfirst.frc.team3189.robot.commands;

import static org.usfirst.frc.team3189.robot.utility.Variables.arcadeJoystickXSensitivityFactor;

import org.usfirst.frc.team3189.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ArcadeDriveCommand extends Command {

    public ArcadeDriveCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.longDrivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.longDrivetrain.arcadeDrive(Robot.oi.getJoystickY(), -Robot.oi.getJoystickX() * arcadeJoystickXSensitivityFactor.getData());
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
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
