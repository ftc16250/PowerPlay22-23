package org.firstinspires.ftc.teamcode.ftc16250.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import org.firstinspires.ftc.teamcode.ftc16250.hardware.HolonomicDriveHardware;

@TeleOp(group = "test")
public class TestHolonomicDrive extends OpMode {
    HolonomicDriveHardware drive = new HolonomicDriveHardware();

    @Override
    public void init() {
        drive.init(hardwareMap);
    }

    @Override
    public void loop() {
        // test if game-pads work
        if (gamepad1.a) {
            drive.setMotorDirection(
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD
            );
            drive.setMotorPower(1, 1, 1, 1);
        }

        // don't spin motor if nothing is pressed
        else drive.setMotorPower(0, 0, 0, 0);
    }
}