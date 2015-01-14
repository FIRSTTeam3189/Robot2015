package org.usfirst.frc.team3189.robot.utility;

import edu.wpi.first.wpilibj.SpeedController;

public class ReversedSpeedController implements SpeedController{
	
	private SpeedController speedController;
	
	public ReversedSpeedController(SpeedController speedController) {
		this.speedController = speedController;
	}

	@Override
	public void pidWrite(double output) {
		speedController.pidWrite(output);
		
	}

	@Override
	public double get() {
		return -speedController.get();
	}

	@Override
	public void set(double speed, byte syncGroup) {
		speedController.set(-speed, syncGroup);
	}

	@Override
	public void set(double speed) {
		speedController.set(-speed);
	}

	@Override
	public void disable() {
		speedController.disable();
	}

}
