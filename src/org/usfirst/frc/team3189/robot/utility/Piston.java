package org.usfirst.frc.team3189.robot.utility;

import edu.wpi.first.wpilibj.Solenoid;

public class Piston {
	
	private Solenoid extend;
	private Solenoid retract;
	
	public Piston(int extendChannel, int retractChannel, boolean isExtended) {
		extend = new Solenoid(extendChannel);
		retract = new Solenoid(retractChannel);
		extend.set(isExtended);
		retract.set(!isExtended);
	}
	
	/**
	 * Sets extend to true
	 * Sets extend to false
	 */
	public void extend () {
		extend.set(true);
		retract.set(false);
	}
	
	/**
	 * Sets extend to false
	 * Sets retract to true
	 */
	public void retract () {
		extend.set(false);
		retract.set(true);
	}
	
	/**
	 * Sets extend Solenoid to the opposite of its value
	 * Sets retract Solenoid to the opposite of its value
	 */
	public void toggle () {
		extend.set(!extend.get());
		retract.set(!retract.get());
	}
	public boolean isExtended(){
		return extend.get();
	}

}
