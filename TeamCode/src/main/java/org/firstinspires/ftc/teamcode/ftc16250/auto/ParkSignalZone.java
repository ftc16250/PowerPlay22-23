package org.firstinspires.ftc.teamcode.ftc16250.auto;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.ftc16250.hardware.ColorSensorHardware;

public class ParkSignalZone extends LinearOpMode {
    BaseAuto robot = new BaseAuto();
    ColorSensorHardware color = new ColorSensorHardware();

    @Override
    public void runOpMode() {
        robot.init(hardwareMap);
        color.init(hardwareMap);
        waitForStart();

        // move robot towards signal cone
        robot.move_cm_backwards(40, 2);

        // read color on signal sleeve
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();

        telemetry.addData("red", red);
        telemetry.addData("green", green);
        telemetry.addData("blue", blue);
        telemetry.update();

        // move past the signal cone
        robot.move_cm_backwards(20, 2);

        // park in location 1 if red
        if (red > green && red > blue)
            robot.move_cm_right(40, 2);
        // park in location 2 if green
        else if (green > red && green > blue);
        // park in location 3 if blue
        else if (blue > red && blue > green)
            robot.move_cm_left(40, 2);
    }
}
