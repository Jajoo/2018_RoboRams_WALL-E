//this is a test
package org.usfirst.frc.team6078.robot;

import org.usfirst.frc.team6078.robot.subsystems.Arm.ArmMotors;
import org.usfirst.frc.team6078.robot.subsystems.Arm.Intake;
import org.usfirst.frc.team6078.robot.subsystems.Drivetrain.Drivetrain;
import org.usfirst.frc.team6078.robot.subsystems.Drivetrain.EasyDrivetrainAuton;

import edu.wpi.first.wpilibj.CameraServer;
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
		
      		
		//Enables Camera 0 on SmartDashboard
		//UsbCamera Cam0 = new UsbCamera ("Cam0" , 0);
		CameraServer.getInstance().startAutomaticCapture(0);
        //Cam0.setResolution(1080, 720);
		        
        //Enables another Camera lets see if this works
        //UsbCamera Cam1 = new UsbCamera ("Cam1", 0);
        //CameraServer.getInstance().startAutomaticCapture(Cam1);
        //Cam1.setResolution(1080, 720);
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
		
			EasyDrivetrainAuton.easyAuton(1, "straight", 2);                                    
			EasyDrivetrainAuton.easyAuton(.5, "right", 2);
			//EasyDrivetrainAuton.easyAuton(1, "straight", 1);
			//EasyArmAuton.easyIntakeAuton(1, 3);
		
		//DIFERENT CODE THIS IS A BARRIER
		
			//EasyArmAuton.easyIntakeAuton(-1, 1);
			//KEY for auton below so we know what each number represents:
			//EasyDrivetrainAuton.easyAuton(speed, direction, time);
			//EasyArmAuton.easyArmAuton(.8, 1);

	}
	

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		
		//EasyDrivetrainAuton.easyAuton(1, "straight", 2);                                    
		//EasyDrivetrainAuton.easyAuton(.5, "right", 2);
		
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
			
			//ArmMotors.intakeMotor1.set(1);
			
			Intake.intakeFunction();
			
			Drivetrain.drivetrainV1.drive.arcadeDrive(-OI.operatorJoystick.getY(), OI.operatorJoystick.getX());
			
			ArmMotors.intakeMotor1.set(-OI.flightStick.getRawAxis(3));
				
			ArmMotors.lifter.set(OI.flightStick.getY());
			
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

