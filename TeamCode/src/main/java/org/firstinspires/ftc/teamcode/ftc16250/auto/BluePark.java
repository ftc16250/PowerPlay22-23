package org.firstinspires.ftc.teamcode.ftc16250.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous
public class BluePark extends LinearOpMode {
    BaseAuto robot = new BaseAuto();

    @Override
    public void runOpMode() {
        robot.init(hardwareMap);
        waitForStart();
		robot.move_cm_backwards(72, 3);
    }
}
