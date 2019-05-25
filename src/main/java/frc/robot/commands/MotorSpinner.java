/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * This command spins the motor 360 degrees
 */
public class MotorSpinner extends Command {

  final int TICKS_PER_REV = 4096;

  public MotorSpinner() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.talonSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.talonSubsystem.setEncoderQuad(0);
  }

  // Called repeatedly when this Command is scheduled to 
  //in this program, the wheel will turn 360 degrees.
  @Override
  protected void execute() {
      Robot.talonSubsystem.setSpeed(0.5); //speeds are from -1 to 1
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    if (Robot.talonSubsystem.getEncoderQuad() >= TICKS_PER_REV)
      return true;
    else
      return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
