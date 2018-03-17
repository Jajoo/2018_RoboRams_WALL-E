package org.usfirst.frc.team6078.robot.subsystems.Arm;

import org.usfirst.frc.team6078.robot.OI;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Intake {

	public static void IntakeFunctions () {
	
		if(OI.flightStick.getRawButton(1)) {
			
			OI.piston1extract.set(DoubleSolenoid.Value.kReverse);
		} 
		else {
			
			OI.piston1extract.set(DoubleSolenoid.Value.kForward);
		}
		
	}
}
	
