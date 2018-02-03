package org.usfirst.frc.team6078.robot.subsystems;

import org.usfirst.frc.team6078.robot.RobotMap;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import edu.wpi.first.wpilibj.Servo;

import org.usfirst.frc.team6078.robot.*;

import org.usfirst.frc.team6078.robot.subsystems.*;

public class Arm {
	
	public static void armMover () {
		
		boolean trigger;
		boolean button3;
		
		trigger = OI.armJoystick.getRawButton(1);
		button3 = OI.armJoystick.getRawButton(2);
		
		RobotMap.frontLeftMotor.set(OI.armJoystick.getY());
		
		if (trigger = true) {
			
			RobotMap.intakeMotor1.set(Constants.intakeMotorSpeed);
			RobotMap.intakeMotor2.set(Constants.intakeMotorSpeed);
		}
		
		if (button3 = true) {
			
			RobotMap.intakeMotor1.set(-Constants.intakeMotorSpeed);
			RobotMap.intakeMotor2.set(-Constants.intakeMotorSpeed);
		}
	}
}