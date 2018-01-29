package org.usfirst.frc.team6078.robot.subsystems;

import org.usfirst.frc.team6078.robot.OI;

public class Turbo {
	
	static boolean buttonValue3;
	static boolean buttonValue4;
	
	static double joystickOutputY;
	static double joystickOutputX;

	static double handicapY;
	static double handicapX;
	
	public static double yOutPut() {
		
		buttonValue3 = OI.operatorJoystick.getRawButton(3);
		buttonValue4 = OI.operatorJoystick.getRawButton(4);
		
		joystickOutputY = OI.operatorY;
		
		//While function for the button to always work
		while(true) {
			
			if (buttonValue3 = false) {
				
				handicapY = .8;
			}
			
			else if (buttonValue3 = true) {
				
				handicapY = 1;
			}
			
			else if (buttonValue4 = true) {
				
				handicapY = .8;
			}
			
			joystickOutputY = joystickOutputY * handicapY;
	
			return joystickOutputY;
		}
	
	}
	
	public static double xOutPut() {
		
		buttonValue3 = OI.operatorJoystick.getRawButton(3);
		buttonValue4 = OI.operatorJoystick.getRawButton(4);
		
		joystickOutputX = OI.operatorX;
		
		while(true) {
		
			if (buttonValue3 = false) {
				
				handicapX = .6;
			}
		
			else if (buttonValue3 = true) {
			
				handicapX = .8;
			}
		
			else if (buttonValue4 = true) {
			
				handicapY = .6;
			}
		
			joystickOutputY = joystickOutputY * handicapY;
			
			return joystickOutputX;
		
		}
	}
	
}
