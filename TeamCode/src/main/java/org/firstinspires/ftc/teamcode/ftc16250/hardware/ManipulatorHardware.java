package org.firstinspires.ftc.teamcode.ftc16250.hardware;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class ManipulatorHardware {
    public Servo leftServo;
    public Servo rightServo;

    public void init(HardwareMap hardwareMap) {
        leftServo = hardwareMap.get(Servo.class, "lS");
        rightServo = hardwareMap.get(Servo.class, "rS");
        rightServo.setDirection(Servo.Direction.REVERSE);
    }

    public void setPosition(double position) {
        leftServo.setPosition(position);
        rightServo.setPosition(position);
    }
}