package org.usfirst.frc.team2854.robot.subsystems;

import org.usfirst.frc.team2854.robot.OI;
import org.usfirst.frc.team2854.robot.RobotMap;
import org.usfirst.frc.team2854.robot.commands.Shoot;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
    
	Talon motorShoot;
	Talon motorTrigger;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Shooter() {
		motorShoot = new Talon(RobotMap.MapShooter.motorShooter);
		motorTrigger = new Talon(RobotMap.MapShooter.motorTrigger);
	}
	public void shoot() {
		motorShoot.set(.75);
	}
	
	public void open() {
		motorTrigger.set(1);
		Timer.delay(1);
		stopShooter();
	}
	
	public void stopShooter() {
		motorShoot.set(0);
	}
	
	public void stopTrigger() {
		motorTrigger.set(0);
	}

    public void initDefaultCommand() {
    	setDefaultCommand(new Shoot(OI.OIMap.JoystickId.JOY1, OI.OIMap.Button.RB, OI.OIMap.Button.X));
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}