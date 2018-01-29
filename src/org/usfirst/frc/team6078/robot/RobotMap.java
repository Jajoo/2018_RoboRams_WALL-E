package org.usfirst.frc.team6078.robot;

import org.usfirst.frc.team6078.robot.subsystems.Constants;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;

/**,,
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//Defining motors for Drivetrain
	public static Spark frontLeftMotor = new Spark(Constants.frontLeftMotorPort);	
	public static Spark frontRightMotor = new Spark(Constants.frontRightMotorPort);
	public static Spark backLeftMotor = new Spark(Constants.backLeftMotorPort);
	public static Spark backRightMotor = new Spark(Constants.backRightMotorPort);
	
	public static SpeedControllerGroup LeftMotors = new SpeedControllerGroup(frontLeftMotor, backLeftMotor);
	public static SpeedControllerGroup RightMotors = new SpeedControllerGroup(frontRightMotor, backRightMotor);
	
}
