package org.usfirst.frc.team6078.robot.subsystems;

import org.usfirst.frc.team6078.robot.RobotMap;



//import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import edu.wpi.first.wpilibj.Servo;

import org.usfirst.frc.team6078.robot.*;

import org.usfirst.frc.team6078.robot.subsystems.*;


public class Drivetrain {
	
	public static class  drivetrainV1 {
	
		public static DifferentialDrive drive = new DifferentialDrive(RobotMap.LeftMotors, RobotMap.RightMotors);
	
	}
	
	
	//For auton at the moment, maybe get this working for teleop? dafd
	public static void alernateDrive(int cet) {
			// -----> Don't set cet greater than 1 or less than -1 <--------
		
			//If all you want to do is move forwards or backwards
			if (cet <= 1) {
			RobotMap.frontLeftMotor.set(cet);
			RobotMap.frontRightMotor.set(cet);
			
			RobotMap.backLeftMotor.set(cet);
			RobotMap.backRightMotor.set(cet);
			}
			
			/**
			 * So like the usual exampleMotor.set() function works on a -1 - 1 scale, this
			 * turning stuff works on a 2 - 4 scale (it subtracts the number by 3 so it works 
			 * with .set()). For example, if you plug in 4, the left motors will go forward
			 * at full speed, and the right motors backward at full speed, turning the robot
			 * left. If you plug in 2, the right motors will go forward at full speed, the left 
			 * motors backward at full speed, turning the robot right. 
			 */
			//UNTESTED 12:30 2/10
			else if (cet > 1 && cet <= 4) {
				
				int cetLeft;
				int cetRight;
				
				cetLeft = cet - 3;
				cetRight = -cetLeft;
				
				//Turns the left motors one direction
				RobotMap.frontLeftMotor.set(cetLeft);
				RobotMap.backLeftMotor.set(cetLeft);
				
				//Turns the right motors another direction
				RobotMap.frontRightMotor.set(cetRight);
				RobotMap.backRightMotor.set(cetRight);
				
			}
			
	}
	
}

