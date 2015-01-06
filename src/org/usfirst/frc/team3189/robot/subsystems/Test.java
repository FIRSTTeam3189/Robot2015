package org.usfirst.frc.team3189.robot.subsystems;

import org.usfirst.frc.team3189.robot.RobotMap;
import org.usfirst.frc.team3189.robot.commands.TestDoNothing;
import org.usfirst.frc.team3189.robot.utility.Piston;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Test extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	/** Analog Input, not Artificial Intelligence. */
	private AnalogInput testAI;
	private DigitalInput testDI;
	private Piston testPiston;
	
	public Test() {
		testAI = new AnalogInput(RobotMap.testAIChannel);
		testDI = new DigitalInput(RobotMap.testDIChannel);
		testPiston = new Piston(RobotMap.testSolenoid1Channel, RobotMap.testSolenoid2Channel, false);
	}

    public void initDefaultCommand() {
        setDefaultCommand(new TestDoNothing());
    }
    
    /**
     * Get the test AI's(Analog Input) value
     * @return the int value from analog input
     */
    public int getTestAI(){
    	return testAI.getValue();
    }
    
    /**
     * Get the test DI's value
     * @return the boolean value from the digital input
     */
    public boolean getTestDI () {
    	return testDI.get();
    }
    
    /**
     * Toggles the test piston from its current state
     */
    public void toggleTestPiston () {
    	testPiston.toggle();
    }
    
    /**
     * Sets the test piston to extend for rectract manually
     * @param extend - whether the piston should be extended or not
     */
    public void setPistonState (boolean extend) {
    	if (extend) {
    		testPiston.extend();
    	} else {
    		testPiston.retract();
    	}
    }
}
