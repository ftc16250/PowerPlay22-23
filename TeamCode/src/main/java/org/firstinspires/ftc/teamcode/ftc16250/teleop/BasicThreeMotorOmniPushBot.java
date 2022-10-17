package org.firstinspires.ftc.teamcode.ftc16250.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.ftc16250.hardware.ThreeMotorOmniDriveHardware;

public class BasicThreeMotorOmniPushBot extends OpMode {
    public ThreeMotorOmniDriveHardware drive;

    @Override
    public void init() {
        drive.init(hardwareMap);
    }

    @Override
    public void loop() {

    }
}
