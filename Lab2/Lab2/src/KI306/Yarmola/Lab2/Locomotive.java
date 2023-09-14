package KI306.Yarmola.Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * The <code>Locomotive</code> class represents a locomotive and its operations.
 * It includes functionality for managing the locomotive's engine, doors, speed,
 * and train cars. This class also logs events to a file named "Log.txt".
 *
 * @author Yurii Yarmola
 * @version 1.0
 */
public class Locomotive {
    private Engine engine;
    private int train_car_num;
    private boolean is_door_open;
    private PrintWriter fout;

    public static int number_open_door = 0;
    /**
     * Default constructor for the locomotive.
     *
     * @throws FileNotFoundException Thrown when "Log.txt" file is not found.
     */
    public Locomotive() throws FileNotFoundException {
        engine = new Engine();
        train_car_num = 0;
        is_door_open = false;
        fout = new PrintWriter(new File("Log.txt"));
        fout.println();
        fout.write("Create locomotive");
    }

    /**
     * Parameterized constructor for the locomotive.
     *
     * @param engine_working   Specifies if the engine is initially working.
     * @param train_car_number The initial number of train cars.
     * @param open_door        Specifies if the door is initially open.
     * @throws FileNotFoundException Thrown when "Log.txt" file is not found.
     */
    public Locomotive(boolean engine_working, int train_car_number, boolean open_door) throws FileNotFoundException {
        engine = new Engine(engine_working);
        train_car_num = train_car_number;
        is_door_open = open_door;
        if(is_door_open){
          number_open_door += 1;
        }
        fout = new PrintWriter(new File("Log.txt"));
        fout.println();
        fout.write("Create working locomotive");
    }

    /**
     * Opens the door of the locomotive.
     */
    public void open_door() {
        fout.println();
        fout.write("Door in locomotive is open");
        if(!is_door_open) {
            number_open_door += 1;
        }
        is_door_open = true;
    }

    /**
     * Closes the door of the locomotive.
     */
    public void close_door() {
        fout.println();
        fout.write("Door in locomotive is closed");
        number_open_door -= 1;
        is_door_open = false;
    }

    /**
     * Checks if the door of the locomotive is open.
     *
     * @return True if the door is open, false otherwise.
     */
    public boolean is_door_opened() {
        fout.println();
        if (is_door_open)
            fout.write("Door in locomotive is open");
        else
            fout.write("Door in locomotive is closed");
        return is_door_open;
    }

    /**
     * Stops the locomotive's engine.
     */
    public void stop_locomotive() {
        engine.stop_engine();
        fout.println();
        fout.write("Stop locomotive");
    }

    /**
     * Increases the speed of the locomotive.
     *
     * @return The current speed of the locomotive.
     */
    public int add_speed() {
        int power = engine.add_power();
        int speed = power * 3 / train_car_num;
        fout.println();
        fout.write("Speed now = " + Integer.toString(speed));
        return speed;
    }

    /**
     * Decreases the speed of the locomotive.
     *
     * @return The current speed of the locomotive.
     */
    public int minus_speed() {
        int power = engine.minus_power();
        int speed = power * 3 / train_car_num;
        fout.println();
        fout.write("Speed now = " + Integer.toString(speed));
        return speed;
    }

    /**
     * Starts the locomotive's engine.
     */
    public void start_locomotive() {
        engine.start_engine();
        fout.println();
        fout.write("Start locomotive");
    }

    /**
     * Adds train cars to the locomotive.
     *
     * @param number The number of train cars to add.
     * @return The updated total number of train cars.
     */
    public int add_car(int number) {
        train_car_num += number;
        fout.println();
        String number_string = Integer.toString(number);
        fout.write("Add " + number_string + " cars");
        return train_car_num;
    }

    /**
     * Removes train cars from the locomotive.
     *
     * @param number The number of train cars to remove.
     * @return The updated total number of train cars.
     */
    public int minus_car(int number) {
        if (train_car_num - number < 0) {
            train_car_num = 0;
        } else {
            train_car_num -= number;
        }
        String number_string = Integer.toString(number);
        fout.println();
        fout.write("Minus " + number_string + " cars");
        return train_car_num;
    }

    /**
     * Closes the PrintWriter used for logging.
     */
    public void dispose() {
        fout.close();
    }
}

/**
 * The <code>Engine</code> class represents the engine of the locomotive.
 * It includes properties and methods related to the engine's operation.
 */
class Engine {
    private int rotate_num;
    private boolean is_working;

    /**
     * Default constructor for the engine.
     */
    public Engine() {
        rotate_num = 0;
        is_working = false;
    }

    /**
     * Parameterized constructor for the engine.
     *
     * @param work Specifies if the engine is initially working.
     */
    public Engine(boolean work) {
        is_working = work;
        if (work) {
            rotate_num = 1000;
        } else {
            rotate_num = 0;
        }
    }

    /**
     * Checks if the engine is working.
     *
     * @return True if the engine is working, false otherwise.
     */
    public boolean is_engine_work() {
        return is_working;
    }

    /**
     * Starts the engine.
     */
    public void start_engine() {
        is_working = true;
        rotate_num = 1000;
    }

    /**
     * Stops the engine.
     */
    public void stop_engine() {
        is_working = false;
        rotate_num = 0;
    }

    /**
     * Increases the engine's power and returns it.
     *
     * @return The current engine power.
     */
    public int add_power() {
        if (is_working) {
            rotate_num += 100;
            return rotate_num * 2;
        } else {
            return 0;
        }
    }

    /**
     * Decreases the engine's power and returns it.
     *
     * @return The current engine power.
     */
    public int minus_power() {
        if (is_working) {
            if (rotate_num - 100 < 0) {
                rotate_num = 0;
            } else {
                rotate_num -= 100;
            }
            return rotate_num * 2;
        } else {
            return 0;
        }
    }

    /**
     * Gets the current rotation of the engine.
     *
     * @return The current rotation value.
     */
    public int get_rotation() {
        return rotate_num;
    }
}
