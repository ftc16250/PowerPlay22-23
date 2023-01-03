package org.firstinspires.ftc.teamcode.ftc16250.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous
public class TestBaseAuto extends LinearOpMode {
    BaseAuto robot = new BaseAuto();

    @Override
    public void runOpMode() {
        robot.init(hardwareMap);
        waitForStart();
        robot.move_cm_forward(15);
        robot.strafe_cm_right(10);
    }
}