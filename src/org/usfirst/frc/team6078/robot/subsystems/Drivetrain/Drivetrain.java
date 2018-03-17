package org.usfirst.frc.team6078.robot.subsystems.Drivetrain;




//import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;



import edu.wpi.first.wpilibj.Servo;

import org.usfirst.frc.team6078.robot.*;

import org.usfirst.frc.team6078.robot.subsystems.*;


public class Drivetrain {
	
	//for weBackwardsNowBois
	public static int backInt = 1;
	
	public static class drivetrainV1 {
		
		public static DifferentialDrive drive = new DifferentialDrive(DrivetrainMotors.LeftMotors, DrivetrainMotors.RightMotors);
	
	}
	
	public static void weBackwardsNowBois() {
		
		if (OI.operatorJoystick.getRawButton(1)) {
			
			backInt = -1; 
		}
		
		else {
			
			backInt = 1;
		}
	}
	
}

