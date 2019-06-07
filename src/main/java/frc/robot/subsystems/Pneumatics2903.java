package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Pneumatics2903 extends Subsystem {
    Solenoid pistonOpen;
    Solenoid pistonClose;

    public Pneumatics2903 () {
        pistonOpen = new Solenoid(RobotMap.pistonOpen);
        pistonClose = new Solenoid(RobotMap.pistonClose);
    }

    public void close () {
        pistonOpen.set(false);
        pistonClose.set(true);
    }

    public void open () {
        //You do this one!!
    }

    @Override
    protected void initDefaultCommand() {

    }
}