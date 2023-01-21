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

    public void move_cm_forward(double num) {
        driver.setMotorMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        driver.setLeftDirection(DcMotorSimple.Direction.FORWARD);
        driver.setRightDirection(DcMotorSimple.Direction.FORWARD);
        int tick_distance = (int) (num / driver.CM_PER_ROT * driver.TICKS_PER_REV);

        driver.setLeftVelocity(tick_distance/2);
        driver.setRightVelocity(tick_distance/2);
		sleep(2000);

        driver.setLeftVelocity(0);
        driver.setRightVelocity(0);
        driver.setMotorMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

	public void rotate_deg_cw(int deg) {
		driver.setMotorMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
		driver.setLeftDirection(DcMotor.RunMode.FORWARD);
		driver.setRightDirection(DcMotor.RunMode.REVERSE);
		// calculate ticks to rotate x degrees
		// assume that both wheels making a full rotation can turn the robot 360 degrees
		int tick_distance = (deg / 360 * driver.TICKS_PER_REV);
		driver.setLeftVelocity(tick_distance / 2);
		driver.setRightVelocity(tick_distance / 2);
		sleep(2000);
		driver.setLeftVelocity(0);
		driver.setRightVelocity(0);
		driver.setMotorMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
	}

	public void rotate_deg_ccw(int deg) {
		driver.setMotorMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
		driver.setLeftDirection(DcMotor.RunMode.REVERSE);
		driver.setRightDirection(DcMotor.RunMode.FORWARD);
		// calculate ticks to rotate x degrees
		// assume that both wheels making a full rotation can turn the robot 360 degrees
		int tick_distance = (deg / 360 * driver.TICKS_PER_REV);
		driver.setLeftVelocity(tick_distance / 2);
		driver.setRightVelocity(tick_distance / 2);
		sleep(2000);
		driver.setLeftVelocity(0);
		driver.setRightVelocity(0);
		driver.setMotorMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
	}
}
