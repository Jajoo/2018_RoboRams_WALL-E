package org.usfirst.frc.team6078.robot.commands;

import org.usfirst.frc.team6078.robot.OI;


import org.usfirst.frc.team6078.robot.subsystems.Arm.ArmMotors;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class Intake extends InstantCommand {
	
    public Intake() {
        super("Arm");
    }


    @Override
    protected void initialize() {
        super.initialize();
    }

    protected void execute() {
    	ArmMotors.intakeMotor1.set(1);
    	ArmMotors.intakeMotor2.set(1);
    	
    }
    protected boolean isFinished () {
        return (true);
    }
    protected void end () {
    }

    protected void interrupted () {
    }
}
