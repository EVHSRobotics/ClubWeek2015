package org.usfirst.frc.team2854.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public static class MapDriveTrain {
		public static final int motorFL = 1;
		public static final int motorBL = 2;
		public static final int motorFR = 3;
		public static final int motorBR = 4;
	}
	
	public static class MapShooter {
		public static final int motorShooter = 0;
		public static final int motorTrigger = 1;
	}
}
