package org.firstinspires.ftc.teamcode.ftc16250.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ThreeMotorOmniDriveHardware {
    public DcMotorEx leftMotor;
    public DcMotorEx rightMotor;
    public DcMotorEx centerMotor;

    // how many ticks are in a rotation
    public double TICKS_PER_REV;
    // circumference of the wheel
    public double CM_PER_ROT = 25.1327;

    // get wheel motors from robot hardware config
    public void init(HardwareMap hardwareMap) {
        leftMotor = hardwareMap.get(DcMotorEx.class, "leftMotor");
        rightMotor = hardwareMap.get(DcMotorEx.class, "rightMotor");
        centerMotor = hardwareMap.get(DcMotorEx.class, "centerMotor");

        leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        centerMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        TICKS_PER_REV = leftMotor.getMotorType().getTicksPerRev();
    }

    public void setLeftPower(double p) { leftMotor.setPower(p); }
    public void setRightPower(double p) { rightMotor.setPower(p); }
    public void setCenterPower(double p) { centerMotor.setPower(p); }

    public void setLeftVelocity(double p) { leftMotor.setVelocity(p); }
    public void setRightVelocity(double p) { rightMotor.setVelocity(p); }
    public void setCenterVelocity(double p) { centerMotor.setVelocity(p); }

    public void setMotorMode(DcMotor.RunMode mode) {
        leftMotor.setMode(mode);
        rightMotor.setMode(mode);
        centerMotor.setMode(mode);
    }
}
