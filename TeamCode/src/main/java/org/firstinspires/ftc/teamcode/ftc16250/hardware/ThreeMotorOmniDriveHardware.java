package org.firstinspires.ftc.teamcode.ftc16250.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ThreeMotorOmniDriveHardware {
    DcMotor leftMotor;
    DcMotor rightMotor;
    DcMotor centerMotor;

    // how many ticks are in a rotation
    double TICKS_PER_REV;
    // circumference of the wheel
    double INCHES_PER_ROT = 12.95;

    // get wheel motors from robot hardware config
    public void init(HardwareMap hardwareMap) {
        leftMotor = hardwareMap.dcMotor.get("frontLeftMotor");
        rightMotor = hardwareMap.dcMotor.get("frontRightMotor");
        centerMotor = hardwareMap.dcMotor.get("backLeftMotor");

        leftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        centerMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        TICKS_PER_REV = centerMotor.getMotorType().getTicksPerRev();
    }

    // set all motor directions in one function
    public void setMotorDirection(DcMotorSimple.Direction left, DcMotorSimple.Direction right, DcMotorSimple.Direction center) {
        leftMotor.setDirection(left);
        rightMotor.setDirection(right);
        centerMotor.setDirection(center);
    }
    public void setMotorDirection(DcMotorSimple.Direction direction) {
        leftMotor.setDirection(direction);
        rightMotor.setDirection(direction);
        centerMotor.setDirection(direction);
    }

    // set power of all motors in one function
    public void setMotorPower(double left, double right, double center) {
        leftMotor.setPower(left);
        rightMotor.setPower(right);
        centerMotor.setPower(center);
    }
    public void setMotorPower(double power) {
        leftMotor.setPower(power);
        rightMotor.setPower(power);
        centerMotor.setPower(power);
    }

    // get amount of rotations a wheel has made
    public double getLeftMotorRotations() {
        return leftMotor.getCurrentPosition() / TICKS_PER_REV;
    }
    public double getRightMotorRotations() {
        return rightMotor.getCurrentPosition() / TICKS_PER_REV;
    }
    public double getCenterMotorRotations() {
        return centerMotor.getCurrentPosition() / TICKS_PER_REV;
    }
}