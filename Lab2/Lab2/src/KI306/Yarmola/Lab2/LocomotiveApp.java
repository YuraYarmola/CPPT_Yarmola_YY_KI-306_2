package KI306.Yarmola.Lab2;


import java.io.FileNotFoundException;

/**
 *
 * Locomotive Application class implements main method for Locomotive
 class possibilities demonstration
 * @author Yurii Yarmola
 * @version 1.0
 *
 */
public class LocomotiveApp {
    /**
     *
     * @param args - arguments in main function
     * @throws FileNotFoundException - call when iis not file
     *
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        /*Locomotive train;
        train = new Locomotive(false, 10, false);
        train.start_locomotive();
        train.add_car(2);
        train.add_speed();
        train.add_speed();
        train.add_speed();
        train.is_door_opened();
        train.minus_car(5);
        train.minus_speed();
        train.stop_locomotive();
        train.dispose();*/

        Locomotive train1 = new Locomotive();
        Locomotive train2 = new Locomotive();
        Locomotive train3 = new Locomotive();
        Locomotive train4 = new Locomotive();
        Locomotive train5 = new Locomotive();


        train1.open_door();

        train3.open_door();

        System.out.println(Locomotive.number_open_door);
    }
}