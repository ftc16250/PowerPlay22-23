# File Structure

All the code for the robot controller should be stored in the following format:

### Hardware

When creating code for a piece of hardware (motor, sensor, etc..), you want the name for the class 
to be `the hardware it controls + Hardware`. The class file would be stored in the `hardware/` 
directory.

For example if I created a class which would initialize hardware for the holonomic drive, I would
have it name `HolonomicDriveHardware`.

Hardware classes shouldn't be an extension of an existing OpMode, instead they should be their own
class. All hardware classes should have an init() function which initializes all of the hardware.
With the example of `HolonomicDriveHardware`, it would look like this:

```java
public class HolonomicDriveHardware {
    public DcMotor frontLeft;
    public DcMotor frontRight;
    public DcMotor backLeft;
    public DcMotor backRight;

    // get wheel motors from robot hardware config
    public void init(HardwareMap hardwareMap)
    {
        frontLeft = hardwareMap.dcMotor.get("frontLeftMotor");
        frontLeft = hardwareMap.dcMotor.get("frontRightMotor");
        backLeft = hardwareMap.dcMotor.get("backLeftMotor");
        backLeft = hardwareMap.dcMotor.get("backLeftMotor");
    }
}
```

In this example, we define the `HolonomicDriveHardware` class, define all of the hardware variables,
and initialize them in our init() function.

Inside the hardware class, you can also define other functions which interact with the hardware.

### TeleOp

All TeleOps should be stored in the `teleop/` directory. All classes should extend the `OpMode` class 
and if interacting with hardware, should use the hardware classes to access them. For example, we might 
make a `GamepadControl` class which uses the `HolonomicDriveHardware` hardware class. It would look like
this:

```java
@TeleOp
public class GamepadControl extends OpMode {
    HolonomicDriveHardware drive = new HolonomicDriveHardware();

    @Override
    public void init() {
        drive.init(hardwareMap);
    }

    @Override
    public void loop() {
        // do gamepad related if statements
    }
}
```

Inside the init() function, you want to initialize all of the hardware classes, and do other related 
things which are needed for the robot to run.

If you are writing a TeleOp to test out a hardware class, you should prefix the hardware class name 
with `Test`, for example `HolonomicDriveHardware` would become `TestHolonomicDrive`. It should also be 
part of the group "test" when doing `@TeleOp`, like this:
```java
@TeleOp(group = "test")
```

All TeleOps should extend the `OpMode` class opposed to `LinearOpMode`.

### Autonomous

All Autonomous code should be stored in the `auto/` directory. All autonomous code will normally extend
the `LinearOpMode` class. Everything else is the same with any other TeleOp class.