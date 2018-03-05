package org.usfirst.frc.team6078.robot.subsystems.Arm;

import org.usfirst.frc.team6078.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

public class Intake extends Command {

    public Intake() {
    	super("Intake");
   
    }

    protected void initialize() {
    }

    protected void execute() {
    	
    	ArmMotors.intakeMotor1.set(1);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }
}

