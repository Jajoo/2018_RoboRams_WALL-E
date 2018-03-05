package org.usfirst.frc.team6078.robot.subsystems.Arm;

import org.usfirst.frc.team6078.robot.OI;

public class Arm {

	public static void ArmMotorFunctions () {
		
		ArmMotors.intakeMotor1.set(-OI.flightStick.getRawAxis(3));
		
		ArmMotors.lifter.set(OI.flightStick.getY());
	}
}
