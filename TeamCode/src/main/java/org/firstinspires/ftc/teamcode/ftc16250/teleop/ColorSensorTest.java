package org.firstinspires.ftc.teamcode.ftc16250.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.ftc16250.hardware.ColorSensorHardware;
import org.firstinspires.ftc.teamcode.ftc16250.hardware.ThreeMotorOmniDriveHardware;


@TeleOp(group = "test")
public class ColorSensorTest extends OpMode {
    public ColorSensorHardware color = new ColorSensorHardware();

@Override
    public void init() {
        color.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("Red", color.getRed());
        telemetry.addData("Blue", color.getBlue());
        telemetry.addData("Green", color.getGreen());

        if (color.getGreen() > color.getBlue() && color.getGreen() > color.getRed()) {
            telemetry.addData("Most Seen Color", "Green");
        }
        else if (color.getBlue() > color.getGreen() && color.getBlue() > color.getRed()) {
            telemetry.addData("Most Seen Color", "Blue");
        }
        else if(color.getRed() > color.getBlue() && color.getRed() > color.getGreen()){
            telemetry.addData("Most Seen Color", "Red");
        }

    }
}

