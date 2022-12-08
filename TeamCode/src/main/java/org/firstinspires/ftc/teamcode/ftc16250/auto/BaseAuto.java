package org.firstinspires.ftc.teamcode.ftc16250.auto;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.ftc16250.hardware.ThreeMotorOmniDriveHardware;

public class BaseAuto {
    ThreeMotorOmniDriveHardware driver;

    public void init(HardwareMap hardwareMap) {
        driver.init(hardwareMap);
    }

    public void move_forward(double num, DistanceUnit unit) {
        // do stuff
    }
}