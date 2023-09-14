package KI306.Yarmola.Lab3;

public interface TrainInterface {
    public void open_train_door();
    public  void close_train_door();
    public  void turn_on_light();
    public  void turn_off_light();
    public int add_temperature(int temp);
    public int minus_temperature(int temp);
    public int get_temperature();


}
