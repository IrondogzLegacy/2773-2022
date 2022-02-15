// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    
    //USB
    public static final int gamepadPort = 0;
    public static final int joystickPort = 1;

    public static final double speedFactor = 2.0/3.0;

    //Pneumatics
    public static final int intakePneumaticsController = 0;
    public static final int deploySolenoidPCM = 0;
    public static final int retractSolenoidPCM = 1;

    //Motors
    //CANID - CAN SPARK MAX Motors
    //PWMID - PWN Motors
    public static final int leftForWheelsCANID = 17;
    public static final int rightForWheelsCANID = 21;
    public static final int leftBackWheelsCANID = 20;
    public static final int rightBackWheelsCANID = 18;
    public static final int intakeCANID = 16; //Placeholder value
    public static final int leftHopperCANID = 1;
    public static final int rightHopperCANID = 2;
    public static final int rightShooterMotorPWMID = 3;
    public static final int leftShooterMotorPWMID = 4;
    public static final int kickerMotorPWMID = 5;
    public static final int winchMotorPWMID = 6;

    //Gamepad buttons
    //Axis
    public static final int lStickY = 1; //Left drivetrain speed
    public static final int rStickY = 5; //Right drivetrain speed
    public static final int lTrigger = 2; //Activate intake
    public static final int rTrigger = 3;

    //Buttons
    public static final int A = 1; 
    public static final int B = 2;
    public static final int X = 3;
    public static final int Y = 4;
    public static final int LB = 5; //Deploy intake
    public static final int RB = 6; //Retract intake
}
