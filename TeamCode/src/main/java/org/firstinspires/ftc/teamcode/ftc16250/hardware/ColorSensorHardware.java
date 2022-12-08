package org.firstinspires.ftc.teamcode.ftc16250.hardware;

import com.qualcomm.hardware.rev.RevColorSensorV3;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ColorSensorHardware{

    public RevColorSensorV3 color;

    public void init(HardwareMap hardwareMap) {
        color =  hardwareMap.get(RevColorSensorV3.class, "colorSensor");
    }

    public int getGreen() {
        return color.green();

    }
    public int getBlue() {
        return color.blue();

    }
    public int getRed() {
        return color.red();
    }

}


