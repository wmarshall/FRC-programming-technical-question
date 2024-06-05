package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase{
    private final CANSparkMax pivot;

    public Arm() {
        pivot = new CANSparkMax(1, MotorType.kBrushless);
        pivot.restoreFactoryDefaults();
        pivot.setSmartCurrentLimit(50);
        pivot.setInverted(false);
    }

    public Command up() {
        return this.run(() -> {
            pivot.setVoltage(10);
        });
    }

    public Command down() {
        return this.run(() -> {
            pivot.setVoltage(-10);
        });
    }

    public Command stop() {
        return this.run(() -> {
            pivot.setVoltage(0);
        });
    }
}
