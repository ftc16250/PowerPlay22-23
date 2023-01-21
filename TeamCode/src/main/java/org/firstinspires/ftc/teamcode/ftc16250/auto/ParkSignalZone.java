package org.firstinspires.ftc.teamcode.ftc16250.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous
public class ParkSignalZone extends LinearOpMode {
    BaseAuto robot = new BaseAuto();
	FourBarArmHardware arm = new FourBarArmHardware();

    @Override
    public void runOpMode() {
        robot.init(hardwareMap);

        waitForStart();
		// move up towards signal cone
		robot.move_cm_forward(30);
    }
}
