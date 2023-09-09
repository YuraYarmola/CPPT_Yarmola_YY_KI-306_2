package KI306.Yarmola.Lab3;

import KI306.Yarmola.Lab3.Locomotive.*;
import KI306.Yarmola.Lab3.TrainInterface.*;

import java.io.FileNotFoundException;

/**
 * The {@code ElectricTrain} class represents an electric train, which is a type of locomotive
 * implementing the {@code TrainInterface}. It extends the {@code Locomotive} class and adds
 * specific functionality for an electric train, including control of train doors, lights,
 * and temperature.
 *
 * @author Yura Yarmola
 * @version 1.0
 */
public class ElectricTrain extends Locomotive implements TrainInterface {
    boolean is_train_door_open;
    boolean is_light;
    int temperature;

    /**
     * Default constructor for an electric train. Initializes the train with default values.
     *
     * @throws FileNotFoundException Thrown when "Log.txt" file is not found.
     */
    public ElectricTrain() throws FileNotFoundException {
        super();
        is_train_door_open = false;
        is_light = false;
        temperature = 20;
        fout.println();
        fout.write("Create Electric train");
    }

    /**
     * Parameterized constructor for an electric train.
     *
     * @param open       Specifies if the train door is initially open.
     * @param light      Specifies if the train light is initially on.
     * @param car_number The initial number of train cars.
     * @throws FileNotFoundException Thrown when "Log.txt" file is not found.
     */
    public ElectricTrain(boolean open, boolean light, int car_number) throws FileNotFoundException {
        super(false, car_number, false);
        is_train_door_open = open;
        is_light = light;
        temperature = 20;
        fout.println();
        fout.write("Create Electric train");
    }

    /**
     * Opens the train door.
     */
    @Override
    public void open_train_door() {
        is_train_door_open = true;
        fout.println();
        fout.write("Train door is opened");
    }

    /**
     * Closes the train door.
     */
    @Override
    public void close_train_door() {
        is_train_door_open = false;
        fout.println();
        fout.write("Train door is closed");
    }

    /**
     * Turns on the train light.
     */
    @Override
    public void turn_on_light() {
        is_light = true;
        fout.println();
        fout.write("Train light is turned on");
    }

    /**
     * Turns off the train light.
     */
    @Override
    public void turn_off_light() {
        is_light = false;
        fout.println();
        fout.write("Train light is turned off");
    }

    /**
     * Increases the temperature of the train cabin.
     *
     * @param temp The temperature to add.
     * @return The updated temperature.
     */
    @Override
    public int add_temperature(int temp) {
        temperature += temp;
        fout.println();
        fout.write("Temperature is " + Integer.toString(temperature));
        return temperature;
    }

    /**
     * Decreases the temperature of the train cabin.
     *
     * @param temp The temperature to subtract.
     * @return The updated temperature.
     */
    @Override
    public int minus_temperature(int temp) {
        temperature -= temp;
        fout.println();
        fout.write("Temperature is " + Integer.toString(temperature));
        return temperature;
    }

    /**
     * Gets the current temperature of the train cabin.
     *
     * @return The current temperature.
     */
    @Override
    public int get_temperature() {
        fout.println();
        fout.write("Temperature is " + Integer.toString(temperature));
        return temperature;
    }

    /**
     * Closes the PrintWriter used for logging.
     */
    @Override
    public void dispose() {
        fout.close();
    }
}
