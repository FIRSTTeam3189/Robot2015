package org.usfirst.frc.team3189.robot.subsystems;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Camera extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	private CameraServer server;
	
	public Camera(){
		server = CameraServer.getInstance();
		server.setQuality(10);
		server.startAutomaticCapture("cam0");
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

