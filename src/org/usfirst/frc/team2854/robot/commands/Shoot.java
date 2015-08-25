package org.usfirst.frc.team2854.robot.commands;

import org.usfirst.frc.team2854.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Shoot extends Command {
	private int JoystickId;
	private int RB;
		
    public Shoot(int aJoystickId, int aRB) {
    	requires(Robot.shooter);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	JoystickId = aJoystickId;
    	RB = aRB;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (RB == 1){
    	Robot.shooter.open();
    	Robot.shooter.stopTrigger();
    	Robot.shooter.shoot();
    	Robot.shooter.stopShooter();
    	Robot.shooter.close();
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
