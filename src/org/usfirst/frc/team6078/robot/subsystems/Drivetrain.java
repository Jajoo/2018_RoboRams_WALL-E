package org.usfirst.frc.team6078.robot.subsystems;




//import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


import edu.wpi.first.wpilibj.Servo;

import org.usfirst.frc.team6078.robot.*;

import org.usfirst.frc.team6078.robot.subsystems.*;


public class Drivetrain {
	private static DifferentialDrive ArmDrive = new DifferentialDrive(RobotMap.LeftArmMotor, RobotMap.RightArmMotor);
	public static class  drivetrainV1 {
	
		public static DifferentialDrive drive = new DifferentialDrive(RobotMap.LeftMotors, RobotMap.RightMotors);
	
	}
	
	public static class drivetrainV2 {
		public static DifferentialDrive driveLeft = new DifferentialDrive(RobotMap.frontLeftMotor, RobotMap.backLeftMotor); 
		
		public static DifferentialDrive driveRight = new DifferentialDrive(RobotMap.frontRightMotor, RobotMap.backRightMotor);
		
	}
	
	public static void ArmDrive(double left, double right) {
		ArmDrive.tankDrive(left, right);
	}
	
	//For auton at the moment, maybe get this working for teleop? dafd
	
	//Change this to a while loop dummy, that's why it only works once
	 public static void turboButton() {
		
		boolean buttonValue;
		
		buttonValue = OI.operatorJoystick.getRawButton(3);
		
		if (buttonValue == true) {
			
			Constants.handicap = -1;
		}
		
		else if (buttonValue = false) {
			
			Constants.handicap = -1.4;
			
		}
		
	}
	
	 
	 //If Handicap is added back in will this work?
	public static void switchDirection() {
		
		boolean buttonValue3;
		
		buttonValue3 = OI.operatorJoystick.getRawButton(2);
		
		while (buttonValue3 == true) {
			
			Constants.handicap = 1.4;
			
		}
	
		
	}
	
}

