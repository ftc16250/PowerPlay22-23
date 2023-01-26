package org.firstinspires.ftc.teamcode.ftc16250.hardware;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class HolonomicDriveHardware {
    public DcMotor frontLeft;
    public DcMotor frontRight;
    public DcMotor backLeft;
    public DcMotor backRight;

    // get wheel motors from robot hardware config
    public void init(HardwareMap hardwareMap)
    {
        frontLeft = hardwareMap.dcMotor.get("frontLeftMotor");
        frontLeft = hardwareMap.dcMotor.get("frontRightMotor");
        backLeft = hardwareMap.dcMotor.get("backLeftMotor");
        backLeft = hardwareMap.dcMotor.get("backLeftMotor");
    }

    // set the direction of all motors
    public void setMotorDirection(DcMotorSimple.Direction flDirection, DcMotorSimple.Direction frDirection, DcMotorSimple.Direction blDirection, DcMotorSimple.Direction brDirection) {
        frontLeft.setDirection(flDirection);
        frontRight.setDirection(frDirection);
        backLeft.setDirection(blDirection);
        backRight.setDirection(brDirection);
    }
    public void setMotorDirection(DcMotorSimple.Direction direction) {
        frontLeft.setDirection(direction);
        frontRight.setDirection(direction);
        backLeft.setDirection(direction);
        backRight.setDirection(direction);
    }

    // set power of all motors
    public void setMotorPower(double flPower, double frPower, double blPower, double brPower) {
        frontLeft.setPower(flPower);
        frontRight.setPower(frPower);
        backLeft.setPower(blPower);
        backRight.setPower(brPower);
    }
    public void setMotorPower(double power) {
        frontLeft.setPower(power);
        frontRight.setPower(power);
        backLeft.setPower(power);
        backRight.setPower(power);
    }
}