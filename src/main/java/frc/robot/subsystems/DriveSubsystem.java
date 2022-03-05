// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.CANSparkMax;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new DriveSubsystem. */

  private final CANSparkMax leftForMotor = new CANSparkMax(Constants.leftForWheelsCANID, Constants.motorType);
  private final CANSparkMax rightForMotor = new CANSparkMax(Constants.rightForWheelsCANID, Constants.motorType);
  private final CANSparkMax leftBackMotor = new CANSparkMax(Constants.leftBackWheelsCANID, Constants.motorType);
  private final CANSparkMax rightBackMotor = new CANSparkMax(Constants.rightBackWheelsCANID, Constants.motorType);

  // Speed controller groups
  private final MotorControllerGroup leftMotors = new MotorControllerGroup(leftForMotor, leftBackMotor);
  private final MotorControllerGroup rightMotors = new MotorControllerGroup(rightForMotor, rightBackMotor);

  // Differential drive
  private final DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

  public DriveSubsystem() {
    leftMotors.setInverted(Constants.leftWheelsInverted);
    rightMotors.setInverted(Constants.rightWheelsInverted);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  public void rawDrive(final double leftSpeed, final double rightSpeed) {
    drive.tankDrive(leftSpeed, rightSpeed);
  }

  public void arcadeDrive(final double speed, final double rotation) {
    drive.arcadeDrive(speed, rotation);
  }

  public void arcadeDrive(final double speed, final double rotation, final boolean accel) {
    drive.arcadeDrive(speed, rotation, accel);
  }

  private static double clamp(double x, double min, double max) {
    return x < min ? min : x > max ? max : x;
  }

  public void tankDriveVolts(double leftVolts, double rightVolts) {
    leftMotors.setVoltage(clamp(leftVolts, -Constants.maxMotorVolts, Constants.maxMotorVolts));
    rightMotors.setVoltage(clamp(rightVolts, -Constants.maxMotorVolts, Constants.maxMotorVolts));
  }

  public void stop() {
    leftMotors.stopMotor();
    rightMotors.stopMotor();
  }
}
