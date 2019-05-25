package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/**
 * An example motor subsystem.  You can replace me with your own Subsystem.
 */
public class TalonMotor2903 extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  WPI_TalonSRX motor;

  //for many subsystems, it's necessary to make an init function.
  //In this case, we'll simply run the init code in the constructor.
  //A constructor is a function that only runs when the object (TalonMotor2903) is created.
  //It doesn't return anything (don't even type void!).
  public TalonMotor2903(int channel) {
    motor = new WPI_TalonSRX(channel);
    motor.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
    motor.set(ControlMode.PercentOutput,0);
  }

  //make sure the functions you want to use are public!

  //call this to set the motor speed. Does nothing if motor hasn't been initialized.
  public void setSpeed(double speed) {
    if (motor != null)
      motor.set(ControlMode.PercentOutput,speed);
  }

  //get encoder pwm value
  public int getEncoderPWM() {
    if (motor != null)
      return motor.getSensorCollection().getPulseWidthPosition();
    return 0;
  }

    //get encoder quad value
  public int getEncoderQuad() {
    if (motor != null)
      return motor.getSensorCollection().getQuadraturePosition();
    return 0;
  }

    //sets the encoder position to a new value (without moving motor!)
  public void setEncoderQuad(int position) {
    if (motor != null)
      motor.setSelectedSensorPosition(position);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}