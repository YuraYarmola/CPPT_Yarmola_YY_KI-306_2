package KI306.Yarmola.Lab3;

import KI306.Yarmola.Lab3.Locomotive.*;
import KI306.Yarmola.Lab3.TrainInterface.*;

import java.io.FileNotFoundException;

public class ElectricTrain extends Locomotive implements TrainInterface{
    boolean is_train_door_open;
    boolean is_light;
    int temperature;
    public ElectricTrain() throws FileNotFoundException {
        is_train_door_open = false;
        is_light = false;
        temperature = 20;
    }

    public ElectricTrain(boolean open, boolean light, int car_number) throws FileNotFoundException{
        super(false, car_number, false);
        is_train_door_open = open;
        is_light = light;
        temperature = 20;
    }

    @Override
    public void open_train_door() {
        is_train_door_open = true;
    }

    @Override
    public void close_train_door() {
        is_train_door_open = false;
    }

    @Override
    public void turn_on_light() {
        is_light = true;
    }

    @Override
    public void turn_off_light() {
        is_light = false;
    }

    @Override
    public int add_temperature(int temp) {
        temperature += temp;
        return temperature;
    }

    @Override
    public int minus_temperature(int temp) {
        temperature -= temp;
        return temperature;
    }

    @Override
    public int get_temperature() {
        return temperature;
    }
}
