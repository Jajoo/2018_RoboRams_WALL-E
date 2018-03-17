package org.usfirst.frc.team6078.robot;

import org.usfirst.frc.team6078.robot.subsystems.Arm.EasyArmAuton;
import org.usfirst.frc.team6078.robot.subsystems.Drivetrain.EasyDrivetrainAuton;

import edu.wpi.first.wpilibj.DriverStation;

public class Auton {
	
public static void autonOutOfNames() {
		
		String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();
          if(gameData.length() > 0){
        	  
        	//Put left Auto code here  
        	  if(gameData.charAt(0) == 'L'){
			  
        		  EasyDrivetrainAuton.easyAuton(.7, "forward", 3);
        		  
        		  EasyArmAuton.easyArmAuton(-.5, 1);
        	  } 
        	  //Put Right Auto code here
        	  if(gameData.charAt(0) == 'R') {

        		  EasyDrivetrainAuton.easyAuton(.7, "forward", 3);
        		  
        		  EasyArmAuton.easyArmAuton(-.5, 1); 
        	  }
        	  
        	  else {
        		  
        		  if (gameData.charAt(0) == 'L') {
        			  
        			  EasyDrivetrainAuton.easyAuton(.6, "left", 1);
        			  EasyDrivetrainAuton.easyAuton(.7, "straight", 2);
        			  EasyDrivetrainAuton.easyAuton(.6, "right", 1);
        			  EasyDrivetrainAuton.easyAuton(.7, "straight", 2);
        			  
        			  EasyArmAuton.easyArmAuton(-.5, 1); 
        		  }
        		  
        		  else {
        			  EasyDrivetrainAuton.easyAuton(.6, "right", 1);
        			  EasyDrivetrainAuton.easyAuton(.7, "straight", 2);
        			  EasyDrivetrainAuton.easyAuton(.6, "left", 1);
        			  EasyDrivetrainAuton.easyAuton(.7, "straight", 2);
        			  
        		  }
        			  
        	  }
          }
		}

}
