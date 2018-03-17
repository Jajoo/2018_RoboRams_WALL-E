package org.usfirst.frc.team6078.robot.subsystems.Drivetrain;

import java.util.concurrent.TimeUnit;

import org.usfirst.frc.team6078.robot.subsystems.Arm.Arm;
import org.usfirst.frc.team6078.robot.subsystems.Arm.EasyArmAuton;

import edu.wpi.first.wpilibj.DriverStation;

public class EasyDrivetrainAuton {
	
	public static void easyAuton (double speed, String direction, long time) {
	
		//Drivetrain
		if (direction == "straight") {
		
			DrivetrainMotors.frontLeftMotor.set(-speed);
			DrivetrainMotors.backLeftMotor.set(-speed);
			DrivetrainMotors.frontRightMotor.set(speed);
			DrivetrainMotors.backRightMotor.set(speed);
			
			try {
				TimeUnit.SECONDS.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			DrivetrainMotors.frontLeftMotor.set(0);
			DrivetrainMotors.backLeftMotor.set(0);
			DrivetrainMotors.frontRightMotor.set(0);
			DrivetrainMotors.backRightMotor.set(0);
		}
		
		if (direction == "left") {
			
			DrivetrainMotors.frontLeftMotor.set(-speed);
			DrivetrainMotors.backLeftMotor.set(-speed);
			DrivetrainMotors.frontRightMotor.set(-speed);
			DrivetrainMotors.backRightMotor.set(-speed);
			
			try {
				TimeUnit.SECONDS.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			DrivetrainMotors.frontLeftMotor.set(0);
			DrivetrainMotors.backLeftMotor.set(0);
			DrivetrainMotors.frontRightMotor.set(0);
			DrivetrainMotors.backRightMotor.set(0);
		}	
		
		if (direction == "right") {
			
			DrivetrainMotors.frontLeftMotor.set(speed);
			DrivetrainMotors.backLeftMotor.set(speed);
			DrivetrainMotors.frontRightMotor.set(speed);
			DrivetrainMotors.backRightMotor.set(speed);
			
			try {
				TimeUnit.SECONDS.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			DrivetrainMotors.frontLeftMotor.set(-speed);
			DrivetrainMotors.backLeftMotor.set(-speed);
			DrivetrainMotors.frontRightMotor.set(speed);
			DrivetrainMotors.backRightMotor.set(speed);
		}
		
	}
	

}
