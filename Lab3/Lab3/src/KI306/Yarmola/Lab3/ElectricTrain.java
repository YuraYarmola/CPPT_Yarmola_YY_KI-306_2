package KI306.Yarmola.Lab3;

import KI306.Yarmola.Lab3.Locomotive.*;
import KI306.Yarmola.Lab3.TrainInterface.*;

import java.io.FileNotFoundException;

public class ElectricTrain extends Locomotive implements TrainInterface{
    boolean is_train_door_open;
    boolean is_light;
    int temperature;
    public ElectricTrain() throws FileNotFoundException {
        super();
        is_train_door_open = false;
        is_light = false;
        temperature = 20;
        fout.println();
        fout.write("Create Electric train");

    }

    public ElectricTrain(boolean open, boolean light, int car_number) throws FileNotFoundException{
        super(false, car_number, false);
        is_train_door_open = open;
        is_light = light;
        temperature = 20;
        fout.println();
        fout.write("Create Electric train");
    }

    @Override
    public void open_train_door() {
        is_train_door_open = true;
        fout.println();
        fout.write("Train door is opened");
    }

    @Override
    public void close_train_door() {
        is_train_door_open = false;
        fout.println();
        fout.write("Train door is closed");
    }

    @Override
    public void turn_on_light() {
        is_light = true;
        fout.println();
        fout.write("Train light is turn on");
    }

    @Override
    public void turn_off_light() {
        is_light = false;
        fout.println();
        fout.write("Train light is turn off");
    }

    @Override
    public int add_temperature(int temp) {
        temperature += temp;
        fout.println();
        fout.write("Temperature is " + Integer.toString(temperature));
        return temperature;
    }

    @Override
    public int minus_temperature(int temp) {
        temperature -= temp;
        fout.println();
        fout.write("Temperature is " + Integer.toString(temperature));
        return temperature;
    }

    @Override
    public int get_temperature() {
        fout.println();
        fout.write("Temperature is " + Integer.toString(temperature));
        return temperature;
    }

    @Override
    public void dispose(){
        fout.close();
    }
}
