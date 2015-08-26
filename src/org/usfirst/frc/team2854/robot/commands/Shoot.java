package org.usfirst.frc.team2854.robot.commands;

import org.usfirst.frc.team2854.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Shoot extends Command {
	private int joystickId;
	private int RB;
	private int XB;
		
    public Shoot(int aJoystickId, int aRB, int aXB) {
    	requires(Robot.shooter);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	joystickId = aJoystickId;
    	RB = aRB;
    	XB = aXB;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.oi.getButton(joystickId, XB)){
    		Robot.shooter.shoot();
    	}else{
    		Robot.shooter.stopShooter();
    	}
    	
    	if(Robot.oi.getButton(joystickId, RB)){
    		Robot.shooter.open();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
