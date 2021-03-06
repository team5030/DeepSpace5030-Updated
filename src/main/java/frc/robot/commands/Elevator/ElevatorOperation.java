package frc.robot.commands.Elevator;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class ElevatorOperation extends Command {

	private double speed;
	
    public ElevatorOperation() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.elevatorSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
        speed = Robot.oi.operator.getRawAxis(1); //might be wrong joystick
    	Robot.elevatorSubsystem.operatorControl(speed);
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