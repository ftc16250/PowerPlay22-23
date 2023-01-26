package org.firstinspires.ftc.teamcode.ftc16250.hardware;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ChainLiftHardware {
    public CRServo servo;

    public void init(HardwareMap hardwareMap){
        servo = hardwareMap.get(CRServo.class, "cS");
    }
    public void setServoPower(double power){
        servo.setPower(power);
    }
}
