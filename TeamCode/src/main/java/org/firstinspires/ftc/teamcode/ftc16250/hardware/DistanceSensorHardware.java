package org.firstinspires.ftc.teamcode.ftc16250.hardware;

import com.qualcomm.hardware.rev.Rev2mDistanceSensor;
import com.qualcomm.hardware.rev.RevColorSensorV3;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class DistanceSensorHardware {
  public Rev2mDistanceSensor distance;

    public void init(HardwareMap hardwareMap) {
        distance =  hardwareMap.get(Rev2mDistanceSensor.class, "distanceSensor");
    }

    public double getDistance(DistanceUnit unit) {
        return distance.getDistance(unit);
    }
}


