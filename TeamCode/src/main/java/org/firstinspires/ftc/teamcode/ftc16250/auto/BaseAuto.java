package org.firstinspires.ftc.teamcode.ftc16250.auto;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.ftc16250.hardware.ThreeMotorOmniDriveHardware;

public class BaseAuto {
    ThreeMotorOmniDriveHardware driver = new ThreeMotorOmniDriveHardware();
    final double MOTOR_SPEED = 0.5;

    public void init(HardwareMap hardwareMap) {
        driver.init(hardwareMap);
    }

    public void move_cm_forward(double num) {
        driver.setMotorMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        driver.setLeftDirection(DcMotorSimple.Direction.FORWARD);
        driver.setRightDirection(DcMotorSimple.Direction.FORWARD);

        int tick_distance = (int) (num / driver.CM_PER_ROT * driver.TICKS_PER_REV);
        driver.setMotorTargetPos(tick_distance);
        driver.setMotorMode(DcMotor.RunMode.RUN_TO_POSITION);

        driver.setLeftPower(MOTOR_SPEED);
        driver.setRightPower(MOTOR_SPEED);

        while (driver.leftMotor.isBusy() && driver.rightMotor.isBusy());

        driver.setLeftPower(0);
        driver.setRightPower(0);
    }

    public void strafe_cm_left(double num) {
        driver.setMotorMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        driver.setCenterDirection(DcMotorSimple.Direction.REVERSE);

        int tick_distance = (int) (num / driver.CM_PER_ROT * driver.TICKS_PER_REV);
        driver.setMotorTargetPos(tick_distance);
        driver.setMotorMode(DcMotor.RunMode.RUN_TO_POSITION);

        driver.setCenterPower(MOTOR_SPEED);

        while (driver.centerMotor.isBusy());

        driver.setCenterPower(0);
    }

    public void strafe_cm_right(double num) {
        driver.setMotorMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        driver.setCenterDirection(DcMotorSimple.Direction.FORWARD);

        int tick_distance = (int) (num / driver.CM_PER_ROT * driver.TICKS_PER_REV);
        driver.setMotorTargetPos(tick_distance);
        driver.setMotorMode(DcMotor.RunMode.RUN_TO_POSITION);

        driver.setCenterPower(MOTOR_SPEED);

        while (driver.centerMotor.isBusy());

        driver.setCenterPower(0);
    }
}