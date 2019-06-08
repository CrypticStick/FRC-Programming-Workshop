package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Servo2903 extends Subsystem {
    Servo servo;

    public Servo2903 () {
        servo = new Servo(RobotMap.servo);
    }

    public void farLeft () {
        servo.set(0.0);
    }

    public void farRight () {
        servo.set(1.0);
    }

    @Override
    protected void initDefaultCommand() {

    }
}