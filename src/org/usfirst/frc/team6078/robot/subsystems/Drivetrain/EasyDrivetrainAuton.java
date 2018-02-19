package org.usfirst.frc.team6078.robot.subsystems.Drivetrain;

import java.util.concurrent.TimeUnit;

public class EasyDrivetrainAuton {
	
	public static void easyAuton (double speed, String direction, long time) {
	
		//Drivetrain
		if (direction == "straight") {
		
			DrivetrainMotors.LeftMotors.set(speed);
			DrivetrainMotors.RightMotors.set(speed);
			
			try {
				TimeUnit.SECONDS.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			DrivetrainMotors.LeftMotors.set(0);
			DrivetrainMotors.RightMotors.set(0);
		}
		
		if (direction == "left") {
			
			DrivetrainMotors.LeftMotors.set(speed);
			DrivetrainMotors.RightMotors.set(-speed);
			
			try {
				TimeUnit.SECONDS.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			DrivetrainMotors.LeftMotors.set(0);
			DrivetrainMotors.RightMotors.set(0);
		}
		
		if (direction == "right") {
			
			DrivetrainMotors.LeftMotors.set(-speed);
			DrivetrainMotors.RightMotors.set(speed);
			
			try {
				TimeUnit.SECONDS.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			DrivetrainMotors.LeftMotors.set(0);
			DrivetrainMotors.RightMotors.set(0);
		}
		
	}

}
