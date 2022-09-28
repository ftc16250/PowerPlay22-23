package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import org.firstinspires.ftc.teamcode.ftc16250.HolonomicDrive;

@TeleOp
public class TestHolonomicDrive extends HolonomicDrive {
    @Override
    public void loop() {
        // test if game-pads work
        if (gamepad1.dpad_up) {
            // set direction
            frontLeftWheel.setDirection(DcMotorSimple.Direction.FORWARD);
            frontRightWheel.setDirection(DcMotorSimple.Direction.FORWARD);
            backLeftWheel.setDirection(DcMotorSimple.Direction.FORWARD);
            backRightWheel.setDirection(DcMotorSimple.Direction.FORWARD);
            // set power so they spin
            frontLeftWheel.setPower(1);
            frontRightWheel.setPower(1);
            backLeftWheel.setPower(1);
            backRightWheel.setPower(1);
        }
        else {
            // don't spin motor if nothing is pressed
            frontLeftWheel.setPower(0);
            frontRightWheel.setPower(0);
            backLeftWheel.setPower(0);
            backRightWheel.setPower(0);
        }
    }
}