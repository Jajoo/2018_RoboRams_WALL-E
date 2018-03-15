package org.usfirst.frc.team6078.robot.subsystems.Drivetrain;

import java.util.concurrent.TimeUnit;

import org.usfirst.frc.team6078.robot.subsystems.Arm.Arm;
import org.usfirst.frc.team6078.robot.subsystems.Arm.EasyArmAuton;

import edu.wpi.first.wpilibj.DriverStation;

public class EasyDrivetrainAuton {
	
	public static void easyAuton (double speed, String direction, long time) {
	
		//Drivetrain
		if (direction == "straight") {
		
			DrivetrainMotors.frontLeftMotor.set(speed);
			DrivetrainMotors.backLeftMotor.set(speed);
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
	
	
	//This should be somewhere else. Not sure where, but not here lol
	public static void autonOutOfNames() {
		
		String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();
          if(gameData.length() > 0){
        	  
        	//Put left Auto code here  
        	  if(gameData.charAt(0) == 'L'){
			  
        		  easyAuton(.7, "forward", 3);
        		  easyAuton(.6, "left", 1);
        		  
        		  EasyArmAuton.easyArmAuton(.5, 1);
        		  
        		  easyAuton(.7, "forward", 2);
        	  } 
        	  //Put Right Auto code here
        	  if(gameData.charAt(0) == 'R') {

        		  easyAuton(.7, "forward", 3);
        		  easyAuton(.6, "right", 1);
        		  
        		  EasyArmAuton.easyArmAuton(.5, 1);
        		  
        		  easyAuton(.4, "forward", 2);  
        	  }
        	  
        	  else {
        		  
        		  easyAuton(.7, "forward", 3);
        	  }
          }
		}

}
