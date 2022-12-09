package org.firstinspires.ftc.teamcode.ftc16250.auto;

import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.ftc16250.hardware.ThreeMotorOmniDriveHardware;

public class BaseAuto {
    ThreeMotorOmniDriveHardware driver;

    final double MOTOR_SPEED = 0.5;

    public void init(HardwareMap hardwareMap) {
        driver.init(hardwareMap);
    }

    public void move_cm_forward(double num) {
        driver.setLeftDirection(DcMotorSimple.Direction.FORWARD);
        driver.setRightDirection(DcMotorSimple.Direction.FORWARD);

        while (driver.getRightCMTraveled() < num) {
            driver.setLeftPower(MOTOR_SPEED);
            driver.setRightPower(MOTOR_SPEED);
        }

        driver.setLeftPower(0);
        driver.setRightPower(0);

        driver.resetLeftTicks();
        driver.resetRightTicks();
    }
}