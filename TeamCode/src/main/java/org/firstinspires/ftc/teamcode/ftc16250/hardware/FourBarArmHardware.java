package org.firstinspires.ftc.teamcode.ftc16250.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class FourBarArmHardware {
    public DcMotor rightArmMotor;
    public DcMotor leftArmMotor;

    // get wheel motors from robot hardware config
    public void init(HardwareMap hardwareMap) {
        leftArmMotor = hardwareMap.dcMotor.get("leftArmMotor");
        rightArmMotor = hardwareMap.dcMotor.get("rightArmMotor");
    }

    public void setDirection(DcMotorSimple.Direction d) {
        leftArmMotor.setDirection(d);
        rightArmMotor.setDirection(d);
    }
    public void setPower(double p) {
        rightArmMotor.setPower(p);
        leftArmMotor.setPower(p);
    }
}
