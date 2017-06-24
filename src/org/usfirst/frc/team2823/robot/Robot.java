package org.usfirst.frc.team2823.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {
	
	//declare output device objects
	Talon rTalon;
	Spark rSpark;
	Talon lTalon;
	Spark lSpark;
	
	@Override
	public void robotInit() {
		//create output device objects
		rTalon = new Talon(0);
		rSpark = new Spark(1);
		lTalon = new Talon(2);
		lSpark = new Spark(3);
		
		//put initial SmartDashboard values
		SmartDashboard.putNumber("Left", 0.0);
		SmartDashboard.putNumber("Right", 0.0);
	}
	
	@Override
	public void autonomousInit() {
		
	}
	
	@Override
	public void autonomousPeriodic() {
		
	}
	
	@Override
	public void teleopPeriodic() {
		//get speeds from controller
		double left = SmartDashboard.getNumber("Left", 0.0);
		double right = SmartDashboard.getNumber("Right", 0.0);
		
		//drive motors
		driveLeft(left);
		driveRight(right);
	}
	
	@Override
	public void testPeriodic() {
		
	}
	
	//drive the left half of the drivetrain
	public void driveLeft(double p) {
		lTalon.set(p);
		lSpark.set(p);
	}
	
	//drive the right half of the drivetrain
	public void driveRight(double p) {
		rTalon.set(-p);
		rSpark.set(-p);
	}
}

