package org.usfirst.frc.team5700.robot.commands;

import org.usfirst.frc.team5700.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class ControlWithJoystick extends Command {

	public ControlWithJoystick() {
        requires(Robot.motorSystem);
    }

	protected void initialize() {
		
	}

    protected void execute() {
    	Robot.motorSystem.setSpeed(Robot.oi.getStick().getY());
    }
    
    protected boolean isFinished() {
    	return false;
    }

    protected void end() {
		Robot.motorSystem.stopMotor();
    }

    protected void interrupted() {
		end();
    }
}
	
	

