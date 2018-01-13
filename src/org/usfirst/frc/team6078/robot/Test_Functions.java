package org.usfirst.frc.team6078.robot;

import java.util.concurrent.TimeUnit;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Test_Functions {
	
	public static void wiggleMotors() {
		
		
		//Wiggles the motors
		RobotMap.frontLeftMotor.set(1);
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RobotMap.frontLeftMotor.set(0);
		
		
		RobotMap.frontRightMotor.set(1);
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RobotMap.frontRightMotor.set(0);
		
		
		RobotMap.backRightMotor.set(1);
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RobotMap.backRightMotor.set(0);

		
		RobotMap.backLeftMotor.set(1);
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RobotMap.backLeftMotor.set(0);
	}
	

	}
