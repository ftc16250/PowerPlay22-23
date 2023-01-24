package org.firstinspires.ftc.teamcode.ftc16250.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.ftc16250.hardware.FourBarArmHardware;
import org.firstinspires.ftc.teamcode.ftc16250.hardware.ManipulatorHardware;
import org.firstinspires.ftc.teamcode.ftc16250.hardware.ThreeMotorOmniDriveHardware;

@TeleOp
public class DriverControlled extends OpMode {
    public ThreeMotorOmniDriveHardware driver = new ThreeMotorOmniDriveHardware();
    public FourBarArmHardware arm = new FourBarArmHardware();
    public ManipulatorHardware manipulator = new ManipulatorHardware();

    public final double MOTOR_SLOW_SPEED = 0.5;

    @Override
    public void init() {
        driver.init(hardwareMap);
        arm.init(hardwareMap);
        manipulator.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("gamepad1.left_stick_x", gamepad1.left_stick_x);
        telemetry.addData("gamepad1.left_stick_y", gamepad1.left_stick_y);
        telemetry.addData("gamepad1.right_stick_x", gamepad1.right_stick_x);
        telemetry.addData("gamepad1.right_stick_y", gamepad1.right_stick_y);
        telemetry.addData("gamepad1.left_trigger",  gamepad1.left_trigger);
        telemetry.addData("gamepad1.right_trigger",  gamepad1.right_trigger);

        // left wheel
        if (gamepad1.left_stick_y != 0) {
            if (gamepad1.left_bumper) driver.setLeftPower(MOTOR_SLOW_SPEED * sign(gamepad1.left_stick_y));
            else driver.setLeftPower(gamepad1.left_stick_y);
        }
        else driver.setLeftPower(0);

        // right wheel
        if (gamepad1.right_stick_y != 0) {
            if (gamepad1.left_bumper) driver.setRightPower(MOTOR_SLOW_SPEED * sign(gamepad1.right_stick_y));
            else driver.setRightPower(gamepad1.right_stick_y);
        }
        else driver.setRightPower(0);

        // center wheel
        if (gamepad1.left_trigger > 0) {
            // move center wheel left
            if (gamepad1.left_bumper) driver.setCenterPower(-MOTOR_SLOW_SPEED);
            else driver.setCenterPower(-gamepad1.left_trigger);
        } else if (gamepad1.right_trigger > 0) {
            // move center wheel right
            if (gamepad1.left_bumper) driver.setCenterPower(MOTOR_SLOW_SPEED);
            else driver.setCenterPower(gamepad1.right_trigger);
        }
        else driver.setCenterPower(0);

        // four bar arm
        if (gamepad2.dpad_up) {
            arm.setDirection(DcMotorSimple.Direction.FORWARD);
            arm.setPower(0.5);
        } else if (gamepad2.dpad_down) {
            arm.setDirection(DcMotorSimple.Direction.REVERSE);
            arm.setPower(0.5);
        }
        else arm.setPower(0.05);

        // manipulator
        if (gamepad2.a) manipulator.setPosition(1.0);
        else manipulator.setPosition(0.5);

        // chain lift
    }

    int sign(double x)
    {
        if (x > 0) return 1;
        else if (x < 0) return -1;
        return 0;
    }
}