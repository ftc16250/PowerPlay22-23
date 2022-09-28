package org.firstinspires.ftc.teamcode.ftc16250;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class HolonomicDrive extends OpMode {
    public DcMotor frontLeftWheel;
    public DcMotor frontRightWheel;
    public DcMotor backLeftWheel;
    public DcMotor backRightWheel;

    @Override
    public void init()
    {
        // get wheel motors from robot hardware config
        frontLeftWheel = hardwareMap.dcMotor.get("frontLeftWheel");
        frontLeftWheel = hardwareMap.dcMotor.get("frontRightWheel");
        backLeftWheel = hardwareMap.dcMotor.get("backLeftWheel");
        backLeftWheel = hardwareMap.dcMotor.get("backLeftWheel");
    }

    @Override
    public void loop() {}
}