package org.firstinspires.ftc.teamcode.ftc16250.teleop;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.ftc16250.hardware.DistanceSensorHardware;

@TeleOp(group = "test")
public class DistanceSensorTest extends OpMode {
    public DistanceSensorHardware distance = new DistanceSensorHardware();

    @Override
    public void init(){
        distance.init(hardwareMap);
    }

    public void distance(){
        double value = distance.getDistance(DistanceUnit.INCH);
        telemetry.addData("Distance", value);
    }

    @Override
    public void loop() {
        distance();
    }
    @Override
    public void stop() {

    }

}
