package org.usfirst.frc.team5700.robot.subsystems;

import org.usfirst.frc.team5700.robot.commands.ControlWithJoystick;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class MotorSystem extends Subsystem{
	
	private Spark motor = new Spark(0);
	
	public void fullSpeed() {
		 motor.set(1);
		}

	public void setSpeed(double speed) {
		 motor.set(speed);
		}
	
	public void stopMotor() {
		 motor.set(0);
		}
	public void initDefaultCommand() {
		setDefaultCommand(new ControlWithJoystick());
	}
}



