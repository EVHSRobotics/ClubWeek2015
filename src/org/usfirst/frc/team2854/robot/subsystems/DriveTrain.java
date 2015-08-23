package org.usfirst.frc.team2854.robot.subsystems;

import org.usfirst.frc.team2854.robot.RobotMap;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	TalonSRX motorFL;
	TalonSRX motorFR;
	TalonSRX motorBR;
	TalonSRX motorBL;
	
	public DriveTrain(){
		
		motorFL = new TalonSRX(RobotMap.MapDriveTrain.motorFL);
		motorBL = new TalonSRX(RobotMap.MapDriveTrain.motorBL);
		motorFR = new TalonSRX(RobotMap.MapDriveTrain.motorFR);
		motorBR = new TalonSRX(RobotMap.MapDriveTrain.motorBR);
	}
	
	//Methods will be given later***
	public void forward() {
		motorFL.set(1);
		motorFR.set(1);
	}
	
	public void back() {
		motorFL.set(-1);
		motorFR.set(-1);
	}
	
	public void stop() {
		motorFL.set(0);
		motorFR.set(0);
		motorBL.set(0);
		motorBR.set(0);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

