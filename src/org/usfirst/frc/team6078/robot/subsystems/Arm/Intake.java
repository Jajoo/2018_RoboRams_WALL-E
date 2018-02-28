package org.usfirst.frc.team6078.robot.subsystems.Arm;

import org.usfirst.frc.team6078.robot.OI;

public class Intake {
	
	public static void intakeFunction() {
		
		boolean intakeBoolean;
    	
    	if (OI.flightStick.getRawAxis(3) > 0) {
    		
    		ArmMotors.intakeMotor1.set(0);
    	}
    	
    	if (OI.flightStick.getRawAxis(3) < 0) {
    		
    		ArmMotors.intakeMotor1.set(1);
    	}
    	

	}

}
