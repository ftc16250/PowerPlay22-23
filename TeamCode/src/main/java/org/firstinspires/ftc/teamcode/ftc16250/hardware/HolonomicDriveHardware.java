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
        frontRight = hardwareMap.dcMotor.get("frontRightMotor");
        backLeft = hardwareMap.dcMotor.get("backLeftMotor");
        backRight = hardwareMap.dcMotor.get("backRightMotor");
    }

    // set the direction of all motors
    public void setMotorDirection(DcMotorSimple.Direction flDirection, DcMotorSimple.Direction frDirection, DcMotorSimple.Direction blDirection, DcMotorSimple.Direction brDirection) {
        frontLeft.setDirection(flDirection);

        if (frDirection == DcMotorSimple.Direction.FORWARD)
            frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
        else
            frontRight.setDirection(DcMotorSimple.Direction.FORWARD);

        backLeft.setDirection(blDirection);

        if (brDirection == DcMotorSimple.Direction.REVERSE)
            backRight.setDirection(DcMotorSimple.Direction.FORWARD);
        else
            backRight.setDirection(DcMotorSimple.Direction.REVERSE);
    }
    public void setMotorDirection(DcMotorSimple.Direction direction) {
        frontLeft.setDirection(direction);

        if (direction == DcMotorSimple.Direction.FORWARD)
            frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
        else
            frontRight.setDirection(DcMotorSimple.Direction.FORWARD);

        backLeft.setDirection(direction);

        if (direction == DcMotorSimple.Direction.REVERSE)
            backRight.setDirection(DcMotorSimple.Direction.FORWARD);
        else
            backRight.setDirection(DcMotorSimple.Direction.REVERSE);
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