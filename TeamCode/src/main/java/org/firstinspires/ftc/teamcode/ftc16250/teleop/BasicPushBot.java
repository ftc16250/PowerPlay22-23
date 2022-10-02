package org.firstinspires.ftc.teamcode.ftc16250.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.ftc16250.hardware.HolonomicDriveHardware;

@TeleOp
public class BasicPushBot extends OpMode {
    HolonomicDriveHardware driver = new HolonomicDriveHardware();

    @Override
    public void init() {
        driver.init(hardwareMap);
        telemetry.addData("status", "initialized");
    }

    @Override
    public void start() {
        telemetry.addData("status", "started");
    }

    @Override
    public void loop() {
        telemetry.addData("gamepad1.left_stick_x", gamepad1.left_stick_x);
        telemetry.addData("gamepad1.left_stick_y", gamepad1.left_stick_y);

        // TODO: change motor direction based on which way they are facing on the robot, as some of the motors are in the opposite direction

        // forward
        // if left_stick is pointing up and isn't pointing left or right
        if (gamepad1.left_stick_y > 0 && (gamepad1.left_stick_x < 0.10 && gamepad1.left_stick_x > -0.10)) {
            driver.setMotorDirection(
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD
            );
            driver.setMotorPower(1, 1, 1, 1);
        }

        // reverse
        // if left_stick is pointing down and isn't pointing left or right
        else if (gamepad1.left_stick_y < 0 && (gamepad1.left_stick_x < 0.10 && gamepad1.left_stick_x > -0.10)) {
            driver.setMotorDirection(
                    DcMotorSimple.Direction.REVERSE,
                    DcMotorSimple.Direction.REVERSE,
                    DcMotorSimple.Direction.REVERSE,
                    DcMotorSimple.Direction.REVERSE
            );
            driver.setMotorPower(1, 1, 1, 1);
        }

        // left
        // if left_stick is pointing to the left and isn't pointing up or down
        else if (gamepad1.left_stick_x < 0 && (gamepad1.left_stick_y < 0.10 || gamepad1.left_stick_y > -0.10)) {
            driver.setMotorDirection(
                    DcMotorSimple.Direction.REVERSE,
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.REVERSE
            );
            driver.setMotorPower(1, 1, 1, 1);
        }

        // right
        // if left_stick is pointing to the right and isn't pointing up or down
        else if (gamepad1.left_stick_x > 0 && (gamepad1.left_stick_y < 0.10 || gamepad1.left_stick_y > -0.10)) {
            driver.setMotorDirection(
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.REVERSE,
                    DcMotorSimple.Direction.REVERSE,
                    DcMotorSimple.Direction.FORWARD
            );
            driver.setMotorPower(1, 1, 1, 1);
        }

        // strafe forward to the left
        // if left_stick is pointing up and to the left
        else if (gamepad1.left_stick_y > 0 && gamepad1.left_stick_x < 0) {
            driver.setMotorDirection(
                    DcMotorSimple.Direction.FORWARD, // front left direction doesn't matter as it isn't gonna be moving
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD  // bottom right direction doesn't matter as it isn't gonna be moving
            );
            driver.setMotorPower(0, 1, 1, 0);
        }

        // strafe forward to the right
        // if left_stick is pointing up and to the right
        else if (gamepad1.left_stick_y > 0 && gamepad1.left_stick_x > 0) {
            driver.setMotorDirection(
                    DcMotorSimple.Direction.FORWARD,
                    DcMotorSimple.Direction.FORWARD, // front right direction doesn't matter as it isn't gonna be moving
                    DcMotorSimple.Direction.FORWARD, // bottom left direction doesn't matter as it isn't gonna be moving
                    DcMotorSimple.Direction.FORWARD
            );
            driver.setMotorPower(1, 0, 0, 1);
        }

        // strafe backwards to the left
        // if left_stick is pointing down and to the left
        else if (gamepad1.left_stick_y < 0 && gamepad1.left_stick_x < 0) {
            driver.setMotorDirection(
                    DcMotorSimple.Direction.REVERSE, // front left direction doesn't matter as it isn't gonna be moving
                    DcMotorSimple.Direction.REVERSE,
                    DcMotorSimple.Direction.REVERSE,
                    DcMotorSimple.Direction.REVERSE  // bottom right direction doesn't matter as it isn't gonna be moving
            );
            driver.setMotorPower(0, 1, 1, 0);
        }

        // strafe backwards to the right
        // if left_stick is pointing down and to the right
        else if (gamepad1.left_stick_y < 0 && gamepad1.left_stick_x > 0) {
            driver.setMotorDirection(
                    DcMotorSimple.Direction.REVERSE,
                    DcMotorSimple.Direction.REVERSE, // front right direction doesn't matter as it isn't gonna be moving
                    DcMotorSimple.Direction.REVERSE, // bottom left direction doesn't matter as it isn't gonna be moving
                    DcMotorSimple.Direction.REVERSE
            );
            driver.setMotorPower(1, 0, 0, 1);
        }

        // don't move robot if nothing is pressed
        else driver.setMotorPower(0, 0, 0, 0);
    }
}
