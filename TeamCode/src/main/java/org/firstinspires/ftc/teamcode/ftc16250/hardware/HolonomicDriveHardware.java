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

    // set power of all motors
    public void setMotorPower(int flPower, int frPower, int blPower, int brPower) {
        frontLeft.setPower(flPower);
        frontRight.setPower(frPower);
        backLeft.setPower(blPower);
        backRight.setPower(brPower);
    }
}