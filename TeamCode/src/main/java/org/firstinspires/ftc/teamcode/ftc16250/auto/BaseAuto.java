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

        driver.setLeftVelocity(tick_distance/2);
        driver.setRightVelocity(tick_distance/2);

        try { Thread.sleep(2000); }
        catch (InterruptedException _) {}

        driver.setLeftVelocity(0);
        driver.setRightVelocity(0);
        driver.setMotorMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }
}