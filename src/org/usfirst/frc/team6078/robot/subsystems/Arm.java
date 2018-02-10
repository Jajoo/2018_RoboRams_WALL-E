package org.usfirst.frc.team6078.robot.subsystems;

import org.usfirst.frc.team6078.robot.OI;
import org.usfirst.frc.team6078.robot.RobotMap;
import static org.usfirst.frc.team6078.robot.RobotMap.LeftArmMotor;
import static org.usfirst.frc.team6078.robot.RobotMap.RightArmMotor;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class Arm extends InstantCommand {
	
    public Arm() {
        super("Arm");
    }


    @Override
    protected void initialize() {
        super.initialize();
    }

    protected void execute() {
        Drivetrain.ArmDrive(OI.flightStick.getX(),OI.flightStick.getX());
    }
    protected boolean isFinished () {
        return (true);
    }
    protected void end () {
    }

    protected void interrupted () {
    }
}
