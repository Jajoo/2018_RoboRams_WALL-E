package org.usfirst.frc.team6078.robot.subsystems.Arm;

import org.usfirst.frc.team6078.robot.Constants;

import edu.wpi.first.wpilibj.Spark;

public class ArmMotors {

	//Intake Motors
	public static Spark intakeMotor1 = new Spark(Constants.intakePort);	
	
	//Lifter
	public static Spark lifter = new Spark(Constants.lifterPort);
	
}
