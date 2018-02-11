package org.usfirst.frc.team6078.robot.subsystems.Drivetrain;

import org.usfirst.frc.team6078.robot.Constants;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class DrivetrainMotors {
	
	public static Spark frontLeftMotor = new Spark(Constants.frontLeftMotorPort);	
	public static Spark frontRightMotor = new Spark(Constants.frontRightMotorPort);
	public static Spark backLeftMotor = new Spark(Constants.backLeftMotorPort);
	public static Spark backRightMotor = new Spark(Constants.backRightMotorPort);
	
	public static SpeedControllerGroup LeftMotors = new SpeedControllerGroup(frontLeftMotor, backLeftMotor);
	public static SpeedControllerGroup RightMotors = new SpeedControllerGroup(frontRightMotor, backRightMotor);
	

}
