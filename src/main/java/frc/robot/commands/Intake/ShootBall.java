package frc.robot.commands.Intake;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShootBall extends Command {

    public ShootBall() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.intakeSubsytem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {}

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.intakeSubsytem.IntakeIn();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;//!Robot.oi.operatorLT.get();
    }

    // Called once after isFinished returns true
    protected void end() {
    	//Robot.intakeSubsytem.ClampCube();
    	Robot.intakeSubsytem.IntakeStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}