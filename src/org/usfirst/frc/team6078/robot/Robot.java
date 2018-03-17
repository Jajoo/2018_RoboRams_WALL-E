//this is a test
package org.usfirst.frc.team6078.robot;

import org.usfirst.frc.team6078.robot.subsystems.Arm.Arm;
import org.usfirst.frc.team6078.robot.subsystems.Arm.ArmMotors;
import org.usfirst.frc.team6078.robot.subsystems.Arm.EasyArmAuton;
//import org.usfirst.frc.team6078.robot.subsystems.Arm.ArmMotors;
import org.usfirst.frc.team6078.robot.subsystems.Arm.Intake;
import org.usfirst.frc.team6078.robot.subsystems.Drivetrain.Drivetrain;
import org.usfirst.frc.team6078.robot.subsystems.Drivetrain.EasyDrivetrainAuton;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

/**
 * The VM is configured to automatically run this class, Eand to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;

	//Auto autonomous checker
	Command autonomousCommand;
	
	//For Smart Dashboard Options
	SendableChooser<Command> chooser = new SendableChooser<>();
	
	//moverChooser = new SendableChooser();

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		oi = new OI();
		
		//Only this one on top for the camera to work best probably more testing and refinement is needed 
		CameraServer.getInstance().startAutomaticCapture(0);

		//Enables Camera 0 on SmartDashboard
		//UsbCamera Cam0 = new UsbCamera ("Cam0" , 0);
        //Cam0.setResolution(700, 700);
	
        //Enables another Camera lets see if this works
        //UsbCamera Cam1 = new UsbCamera ("Cam1", 0);
        //CameraServer.getInstance().startAutomaticCapture(Cam1);
        //Cam1.setResolution(1080, 720);
		
		//Compressor To turn on when the robot is initiated 
		//OI.mainCompressor.start();
		
	}

	

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		//autonomousCommand = chooser.getSelected();

		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */

		// schedule the autonomous	  command (example)
		if (autonomousCommand != null)
			autonomousCommand.start();
		
			EasyDrivetrainAuton.easyAuton(.7, "straight", 2);                                    
	}
	

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		
		//Auton.autonOutOfNames();  
		
		 //EasyDrivetrainAuton.easyAuton(.7, "foward", 3);
		
		//Auton.autonOutOfNames();
		}
	

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		
		// this line or comment it out.
		if (autonomousCommand != null)
			autonomousCommand.cancel();
		
					
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		 
		while(isOperatorControl() && isEnabled()){
			
			//Intake Functions
			//Intake.IntakeFunctions();
			
			//Driving Functions
			Drivetrain.weBackwardsNowBois();
			Drivetrain.drivetrainV1.drive.arcadeDrive(Drivetrain.backInt * OI.operatorJoystick.getY(), OI.operatorJoystick.getX());
			
			
			//Arm Functions
			Arm.ArmMotorFunctions();

		}
		
	}
			
		



	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		//LiveWindow.run();
		
		//Should wiggle ports 0, 1, 2, 3
		
		Test_Functions.wiggleMotors();
	}
		
		
		
		

}

