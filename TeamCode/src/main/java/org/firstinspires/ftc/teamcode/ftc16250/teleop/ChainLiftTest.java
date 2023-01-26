package org.firstinspires.ftc.teamcode.ftc16250.teleop;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.ftc16250.hardware.ChainLiftHardware;

@TeleOp (group = "test")
public class ChainLiftTest extends OpMode {
    public ChainLiftHardware servo = new ChainLiftHardware();

    @Override
    public void init(){
        servo.init(hardwareMap);
    }
    @Override
    public void loop(){
        if(gamepad1.y)
            servo.setServoPower(1);
        else if(gamepad1.x)
            servo.setServoPower(-1);
        else
            servo.setServoPower(0);
    }
}
