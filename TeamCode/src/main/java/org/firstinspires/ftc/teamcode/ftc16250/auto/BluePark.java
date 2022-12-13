package org.firstinspires.ftc.teamcode.ftc16250.auto;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class BluePark extends LinearOpMode {
    BaseAuto robot = new BaseAuto();

    @Override
    public void runOpMode() {
        robot.init(hardwareMap);
        waitForStart();
        robot.strafe_cm_right(72);
    }
}
