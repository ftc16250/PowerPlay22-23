package org.firstinspires.ftc.teamcode.ftc16250.auto;

import org.firstinspires.ftc.teamcode.ftc16250.hardware.ThreeMotorOmniDriveHardware;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public abstract class BaseAuto extends LinearOpMode {
    ThreeMotorOmniDriveHardware drive;

    public void forward(double inches) {
        double num_of_rotations = inches / drive.INCHES_PER_ROT;
    }
}