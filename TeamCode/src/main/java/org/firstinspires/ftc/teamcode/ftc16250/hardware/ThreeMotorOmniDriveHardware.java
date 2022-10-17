package org.firstinspires.ftc.teamcode.ftc16250.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ThreeMotorOmniDriveHardware {
    DcMotor leftMotor;
    DcMotor rightMotor;
    DcMotor centerMotor;

    // get wheel motors from robot hardware config
    public void init(HardwareMap hardwareMap)
    {
        leftMotor = hardwareMap.dcMotor.get("frontLeftMotor");
        rightMotor = hardwareMap.dcMotor.get("frontRightMotor");
        centerMotor = hardwareMap.dcMotor.get("backLeftMotor");
    }

    // set all motor directions in one function
    public void setMotorDirection(DcMotorSimple.Direction left, DcMotorSimple.Direction right, DcMotorSimple.Direction center)
    {
        leftMotor.setDirection(left);
        rightMotor.setDirection(right);
        centerMotor.setDirection(center);
    }
    public void setMotorDirection(DcMotorSimple.Direction direction)
    {
        leftMotor.setDirection(direction);
        rightMotor.setDirection(direction);
        centerMotor.setDirection(direction);
    }

    // set power of all motors in one function
    public void setMotorPower(double left, double right, double center)
    {
        leftMotor.setPower(left);
        rightMotor.setPower(right);
        centerMotor.setPower(center);
    }
    public void setMotorDirection(double direction)
    {
        leftMotor.setPower(direction);
        rightMotor.setPower(direction);
        centerMotor.setPower(direction);
    }
}