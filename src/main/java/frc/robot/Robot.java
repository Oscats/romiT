// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.motorcontrol.Spark;

/**
 * The VM is configured to automatically run this class, and to call the run() function when the
 * robot is enabled. If you change the name of this class or the package after creating this
 * project, you must also update the build.gradle file in the project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
private Spark leftmotorl = new Spark(0);
private Spark rightmotorl = new Spark(1);

private Joystick joyl = new Joystick(0);
public double speed = 0; 

@Override
public void teleopPeriodic() {
speed = -joyl.getRawAxis(1) * .6;
  leftmotorl.set (speed);
  rightmotorl.set(-speed);
}
  @Override
  public void robotInit() {

  }

  /** This function is run when the robot is enabled. */

}
