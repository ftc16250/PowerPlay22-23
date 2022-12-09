package org.firstinspires.ftc.teamcode.ftc16250.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@Autonomous
public class TestBaseAuto extends LinearOpMode {
    BaseAuto robot;

    @Override
    public void runOpMode() {
        robot.init(hardwareMap);
        waitForStart();
        robot.move_cm_forward(15);
    }
}