// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.subsystems.HopperSubsystem;

public class HopperCommand extends CommandBase {
  private final HopperSubsystem hopper;
  private final Joystick gamepad;

  /** Creates a new HopperCommand. */
  public HopperCommand(HopperSubsystem subsystem, Joystick gamepad) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
    hopper = subsystem;
    this.gamepad = gamepad;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    if (hopper.getSpeed() > 1) {
      hopper.motorOn();
    } else {
      hopper.motorOff();
    }
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
