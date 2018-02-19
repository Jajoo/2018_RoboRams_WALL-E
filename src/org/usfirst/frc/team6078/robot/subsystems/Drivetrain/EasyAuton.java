package org.usfirst.frc.team6078.robot.subsystems.Drivetrain;

import java.util.concurrent.TimeUnit;

public class EasyAuton {
	
	public static void easyAuton (double speed, String direction, long time) throws InterruptedException {
	
		if (direction == "straight") {
		
			DrivetrainMotors.LeftMotors.set(speed);
			DrivetrainMotors.RightMotors.set(speed);
			
			TimeUnit.SECONDS.sleep(time);
			
			DrivetrainMotors.LeftMotors.set(0);
			DrivetrainMotors.RightMotors.set(0);
		}
		
		if (direction == "left") {
			
			DrivetrainMotors.LeftMotors.set(speed);
			DrivetrainMotors.RightMotors.set(-speed);
			
			TimeUnit.SECONDS.sleep(time);
			
			DrivetrainMotors.LeftMotors.set(0);
			DrivetrainMotors.RightMotors.set(0);
		}
		
		if (direction == "right") {
			
			DrivetrainMotors.LeftMotors.set(-speed);
			DrivetrainMotors.RightMotors.set(speed);
			
			TimeUnit.SECONDS.sleep(time);
			
			DrivetrainMotors.LeftMotors.set(0);
			DrivetrainMotors.RightMotors.set(0);
		}
		
	}


}
