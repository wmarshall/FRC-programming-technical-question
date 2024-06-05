// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Arm;

public class RobotContainer {

  private final Arm arm;
  private final CommandXboxController controller;

  public RobotContainer() {
    arm = new Arm();
    arm.setDefaultCommand(arm.stop());

    controller = new CommandXboxController(0);

    configureBindings();
  }

  private void configureBindings() {
    controller.y().onTrue(arm.up());
    controller.a().whileTrue(arm.down());
  }
}
