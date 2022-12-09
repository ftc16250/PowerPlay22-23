package org.firstinspires.ftc.teamcode.ftc16250.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ThreeMotorOmniDriveHardware {
    public DcMotor leftMotor;
    public DcMotor rightMotor;
    public DcMotor centerMotor;

    // how many ticks are in a rotation
    double TICKS_PER_REV;
    // circumference of the wheel
    double CM_PER_ROT = 25.1327;

    // get wheel motors from robot hardware config
    public void init(HardwareMap hardwareMap) {
        leftMotor = hardwareMap.dcMotor.get("leftMotor");
        rightMotor = hardwareMap.dcMotor.get("rightMotor");
        centerMotor = hardwareMap.dcMotor.get("centerMotor");

        leftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        centerMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        TICKS_PER_REV = leftMotor.getMotorType().getTicksPerRev();
    }

    public void setRightDirection(DcMotorSimple.Direction d) { rightMotor.setDirection(d); }
    public void setLeftDirection(DcMotorSimple.Direction d) {
        if (d == DcMotorSimple.Direction.FORWARD)
            leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        else
            leftMotor.setDirection(DcMotorSimple.Direction.FORWARD);
    }
    public void setCenterDirection(DcMotorSimple.Direction d) {
        if (d == DcMotorSimple.Direction.FORWARD)
            centerMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        else
            centerMotor.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    public void setLeftPower(double p) { leftMotor.setPower(p); }
    public void setRightPower(double p) { rightMotor.setPower(p); }
    public void setCenterPower(double p) { centerMotor.setPower(p); }

    public double getLeftCMTraveled() { return leftMotor.getCurrentPosition() / TICKS_PER_REV * CM_PER_ROT; }
    public double getRightCMTraveled() { return rightMotor.getCurrentPosition() / TICKS_PER_REV * CM_PER_ROT; }

    public void resetLeftTicks() { leftMotor.setTargetPosition(0); }
    public void resetRightTicks() { rightMotor.setTargetPosition(0); }
}
