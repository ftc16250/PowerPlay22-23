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

	public void sleep(int ms) {
        try { Thread.sleep(ms); }
        catch (InterruptedException _) {}
	}

    public void move_cm_forward(int cm, int seconds) {
        driver.setMotorMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        driver.setLeftDirection(DcMotorSimple.Direction.REVERSE);
        driver.setRightDirection(DcMotorSimple.Direction.REVERSE);
        int tick_distance = (int) (cm / driver.CM_PER_ROT * driver.TICKS_PER_REV);
        driver.setLeftVelocity(tick_distance/seconds);
        driver.setRightVelocity(tick_distance/seconds);
		sleep(seconds * 1000);
        driver.setLeftVelocity(0);
        driver.setRightVelocity(0);
        driver.setMotorMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

	public void move_cm_backwards(int cm, int seconds) {
		driver.setMotorMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
		driver.setLeftDirection(DcMotorSimple.Direction.FORWARD);
		driver.setRightDirection(DcMotorSimple.Direction.FORWARD);
		int tick_distance = (int) (cm / driver.CM_PER_ROT * driver.TICKS_PER_REV);
		driver.setLeftVelocity(tick_distance/seconds);
		driver.setRightVelocity(tick_distance/seconds);
		sleep(seconds * 1000);
		driver.setLeftVelocity(0);
		driver.setRightVelocity(0);
		driver.setMotorMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
	}

	public void move_cm_right(int cm, int seconds) {
		driver.setMotorMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
		driver.setCenterDirection(DcMotorSimple.Direction.FORWARD);
		int tick_distance = (int) (cm / driver.CM_PER_ROT * driver.TICKS_PER_REV);
		driver.setCenterVelocity(tick_distance/seconds);
		sleep(seconds * 1000);
		driver.setCenterVelocity(0);
		driver.setMotorMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
	}

	public void move_cm_left(int cm, int seconds) {
		driver.setMotorMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
		driver.setCenterDirection(DcMotorSimple.Direction.REVERSE);
		int tick_distance = (int) (cm / driver.CM_PER_ROT * driver.TICKS_PER_REV);
		driver.setCenterVelocity(tick_distance/seconds);
		sleep(seconds * 1000);
		driver.setCenterVelocity(0);
		driver.setMotorMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
	}
}
