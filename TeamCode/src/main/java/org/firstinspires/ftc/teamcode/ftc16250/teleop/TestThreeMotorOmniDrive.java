package org.firstinspires.ftc.teamcode.ftc16250.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.ftc16250.hardware.ThreeMotorOmniDriveHardware;

public class TestThreeMotorOmniDrive extends OpMode {
    public ThreeMotorOmniDriveHardware drive;

    @Override
    public void init() {
        drive.init(hardwareMap);
    }

    @Override
    public void loop() {
        // test if game-pads work
        if (gamepad1.a) {
            drive.setMotorDirection(DcMotorSimple.Direction.FORWARD);
            drive.setMotorPower(1, 1, 1);
        }

        if (gamepad1.b) {
            // check what happens when you set negative power
            drive.setMotorPower(-1, -1, -1);
        }

        // don't spin motor if nothing is pressed
        else drive.setMotorPower(0, 0, 0);
    }
}
