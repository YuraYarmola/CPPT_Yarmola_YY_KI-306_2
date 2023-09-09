import KI306.Yarmola.Lab3.ElectricTrain;

import java.io.FileNotFoundException;

/**
 *
 * Train Application class implements main method for electric train
 class possibilities demonstration
 * @author Yurii Yarmola
 * @version 1.0
 *
 */


public class TrainApp {
    public static void main(String[] args) throws FileNotFoundException {
        ElectricTrain train = new ElectricTrain();
        train.start_locomotive();
        train.add_car(4);
        train.open_train_door();
        train.close_train_door();
        train.add_temperature(5);
        train.turn_on_light();
        train.add_speed();
        train.add_speed();
        train.stop_locomotive();
        train.dispose();

    }
}