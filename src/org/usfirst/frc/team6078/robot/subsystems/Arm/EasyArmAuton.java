package org.usfirst.frc.team6078.robot.subsystems.Arm;

import java.util.concurrent.TimeUnit;

public class EasyArmAuton {

	public static void easyArmAuton (double speed, long time) {

			ArmMotors.lifter.set(speed);
			
			try {
				TimeUnit.SECONDS.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ArmMotors.lifter.set(0);
		
	}
	
	public static void easyIntakeAuton (double speed, long time) {
		
		ArmMotors.intakeMotor1.set(-speed);
		
		try {
			TimeUnit.SECONDS.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArmMotors.intakeMotor1.set(0);
	}
}
