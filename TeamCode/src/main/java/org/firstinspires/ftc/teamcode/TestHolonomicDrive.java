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
            setMotorDirection(
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD
            );
            setMotorPower(1, 1, 1, 1);
        }
        else {
            // don't spin motor if nothing is pressed
            setMotorPower(0, 0, 0, 0);
        }
    }
}