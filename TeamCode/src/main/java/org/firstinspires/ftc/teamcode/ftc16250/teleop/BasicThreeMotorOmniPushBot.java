package org.firstinspires.ftc.teamcode.ftc16250.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.ftc16250.hardware.ThreeMotorOmniDriveHardware;

@TeleOp
public class BasicThreeMotorOmniPushBot extends OpMode {
    public ThreeMotorOmniDriveHardware driver = new ThreeMotorOmniDriveHardware();
    public FourBarArmHardware arm = new FourBarArmHardware();

    @Override
    public void init() {
        driver.init(hardwareMap);
		arm.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("gamepad1.left_stick_x", gamepad1.left_stick_x);
        telemetry.addData("gamepad1.left_stick_y", gamepad1.left_stick_y);
        telemetry.addData("gamepad1.right_stick_x", gamepad1.right_stick_x);
        telemetry.addData("gamepad1.right_stick_y", gamepad1.right_stick_y);
        telemetry.addData("gamepad1.left_trigger",  gamepad1.left_trigger);
        telemetry.addData("gamepad1.right_trigger",  gamepad1.right_trigger);
        telemetry.addData("gamepad1.a",  gamepad1.a);
        telemetry.addData("gamepad1.x",  gamepad1.x);

        // left wheel
        if (gamepad1.left_stick_y > 0)
            driver.setLeftDirection(DcMotorSimple.Direction.FORWARD);
        else if (gamepad1.left_stick_y < 0)
            driver.setLeftDirection(DcMotorSimple.Direction.REVERSE);

        // right wheel
        if (gamepad1.right_stick_y > 0)
            driver.setRightDirection(DcMotorSimple.Direction.FORWARD);
        else if (gamepad1.right_stick_y < 0)
            driver.setRightDirection(DcMotorSimple.Direction.REVERSE);

        // center wheel
        if (gamepad1.left_trigger > 0) {
            driver.setCenterDirection(DcMotorSimple.Direction.REVERSE);
            driver.setCenterPower(gamepad1.left_trigger);
        }
        else if (gamepad1.right_trigger > 0) {
            driver.setCenterDirection(DcMotorSimple.Direction.FORWARD);
            driver.setCenterPower(gamepad1.right_trigger);
        }

        driver.setLeftPower(Math.abs(gamepad1.left_stick_y));
        driver.setRightPower(Math.abs(gamepad1.right_stick_y));

		// arm motor
		if (gamepad1.a) {
			arm.setDirection(DcMotorSimple.Direction.FORWARD);
			arm.setPower(0.5);
		}
		else if (gamepad1.x) {
			arm.setDirection(DcMotorSimple.Direction.REVERSE);
			arm.setPower(0.5);
		}
		else {
			arm.setPower(0);
		}
    }
}
