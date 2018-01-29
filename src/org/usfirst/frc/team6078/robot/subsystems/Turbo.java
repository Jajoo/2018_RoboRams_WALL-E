package org.usfirst.frc.team6078.robot.subsystems;

import org.usfirst.frc.team6078.robot.OI;

public class Turbo {
	
	//If it doesn't work, trying setting the button values to false up here
	static boolean buttonValue3;
	static boolean buttonValue4;
	
	static double joystickOutputY;
	static double joystickOutputX;

	static double handicapY;
	static double handicapX;

	public static void slowDrive () {
		
		Drivetrain.drivetrainV1.drive.arcadeDrive (OI.operatorY *.8, OI.operatorX * .6);
		
	}
	
	public static void fastDrive () {
		
		//So my reasoning for decreasing the turn speed is that if you're going faster, you don't
		//want your turn to be too touchy, idk might switch it back
		Drivetrain.drivetrainV1.drive.arcadeDrive (OI.operatorY * 1, OI.operatorX * .5);

	}
	
	public static void radicalDriveSwitcher () {
		
		buttonValue3 = OI.operatorJoystick.getRawButton(3);
		buttonValue4 = OI.operatorJoystick.getRawButton(4);
		
		while (true) {
			
			if (buttonValue3 = false) {
				
				slowDrive();
			}
			
			else if (buttonValue3 = true) {
				
				fastDrive();
			}
			
			else if (buttonValue4 = true) {
				
				slowDrive();
			}
			
			
		}
		
	}
}
