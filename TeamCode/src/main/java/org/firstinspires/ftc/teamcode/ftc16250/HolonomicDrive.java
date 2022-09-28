package org.firstinspires.ftc.teamcode.ftc16250;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class HolonomicDrive extends OpMode {
    public DcMotor frontLeftMotor;
    public DcMotor frontRightMotor;
    public DcMotor backLeftMotor;
    public DcMotor backRightMotor;

    @Override
    public void init()
    {
        // get wheel motors from robot hardware config
        frontLeftMotor = hardwareMap.dcMotor.get("frontLeftMotor");
        frontLeftMotor = hardwareMap.dcMotor.get("frontRightMotor");
        backLeftMotor = hardwareMap.dcMotor.get("backLeftMotor");
        backLeftMotor = hardwareMap.dcMotor.get("backLeftMotor");
    }

    @Override
    public void loop() {}

    // set the direction of all motors
    public void setMotorDirection(DcMotorSimple.Direction flDirection, DcMotorSimple.Direction frDirection, DcMotorSimple.Direction blDirection, DcMotorSimple.Direction brDirection) {
        frontLeftMotor.setDirection(flDirection);
        frontRightMotor.setDirection(frDirection);
        backLeftMotor.setDirection(blDirection);
        backRightMotor.setDirection(brDirection);
    }

    // set power of all motors
    public void setMotorPower(int flPower, int frPower, int blPower, int brPower) {
        frontLeftMotor.setPower(flPower);
        frontRightMotor.setPower(frPower);
        backLeftMotor.setPower(blPower);
        backRightMotor.setPower(brPower);
    }
}