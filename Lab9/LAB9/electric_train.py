# імпорт класу Локомотив
from .locomotive import Locomotive


# оголошення класу Електричка що наслідує клас Локомотив
class ElectricTrain(Locomotive):
    def __init__(self, model, max_speed, passenger_capacity):
        super().__init__(model, max_speed)
        self.passenger_capacity = passenger_capacity
        self._passenger_num = 0

    # запустити пасажирів
    def load_passenger(self, count):
        if self._passenger_num + count < self.passenger_capacity:
            self._passenger_num += count
        else:
            self._passenger_num = self.passenger_capacity

    # випустити пасжирів
    def unload_passengers(self, count):
        if self._passenger_num - count > 0:
            self._passenger_num -= count
        else:
            self._passenger_num = 0

    # повертає кількість пасажирів в поїзді
    def get_passenger_count(self):
        return self._passenger_num

    # повертає вмістимість поїзда
    def get_passenger_capacity(self):
        return self.passenger_capacity


if __name__ == '__main__':
    print('ElectricTrain class, use it in your program')
