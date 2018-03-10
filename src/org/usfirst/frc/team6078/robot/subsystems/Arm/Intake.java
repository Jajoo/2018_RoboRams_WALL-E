package org.usfirst.frc.team6078.robot.subsystems.Arm;

import org.usfirst.frc.team6078.robot.OI;

public class Intake {

	public static void IntakeFunctions () {
	
	if (OI.flightStick.getRawButton(5)) {
		
		ArmMotors.intakeMotor1.set(1);
		
	}
	else {
		
		ArmMotors.intakeMotor1.set(0);
	}
	
	}

}
