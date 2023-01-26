package org.firstinspires.ftc.teamcode.ftc16250.teleop;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.ftc16250.hardware.ManipulatorHardware;

@TeleOp (group = "test")
public class ManipulatorTest extends OpMode {
    public ManipulatorHardware servo = new ManipulatorHardware();

    @Override
    public void init(){
        servo.init(hardwareMap);
    }
    @Override
    public void loop(){
        if(gamepad1.x){
            servo.setServoPosition(1.0);
        }
        else{
            servo.setServoPosition(0.5);
        }
    }
}

