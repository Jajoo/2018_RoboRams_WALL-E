package org.usfirst.frc.team6078.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6078.robot.Robot;

import org.usfirst.frc.team6078.robot.subsystems.*;

/**
 *
 */
public class ExampleCommand extends Command {
	public ExampleCommand() {
		// Use requires() here to declare subsystem dependencies
		
		//Drivetrain.alernateDrive(1);
		
		requires(Robot.exampleSubsystem);
	}
	

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		
		//Drivetrain.alernateDrive(1);
		
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
