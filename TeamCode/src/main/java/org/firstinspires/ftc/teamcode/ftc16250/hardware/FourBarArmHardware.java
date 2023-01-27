package org.firstinspires.ftc.teamcode.ftc16250.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class FourBarArmHardware {
    public DcMotor armMotor;

    // get wheel motors from robot hardware config
    public void init(HardwareMap hardwareMap) {
        armMotor = hardwareMap.dcMotor.get("armMotor");
    }
    public void setPower(double p) {
        armMotor.setPower(p);
    }
}
