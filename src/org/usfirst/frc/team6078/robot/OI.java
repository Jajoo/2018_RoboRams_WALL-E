package org.usfirst.frc.team6078.robot;

import edu.wpi.first.wpilibj.Joystick;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team6078.robot.subsystems.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

//OI Stands for Operator Interface btw
public class OI {

	//To drive the bot
	public static Joystick operatorJoystick = new Joystick(Constants.xboxPort);
	public static Joystick flightStick = new Joystick(Constants.flightStick);
	
	//Splits up X and Y for arcade drive, should half the sensitivity of the Joystick
	public static double operatorY = operatorJoystick.getY();
	public static double operatorX = operatorJoystick.getX();
	
	//button
	public static Button button1 = new JoystickButton(OI.flightStick, 0);
	
}
