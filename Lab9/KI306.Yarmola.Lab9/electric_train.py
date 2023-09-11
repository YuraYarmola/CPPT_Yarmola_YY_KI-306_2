from .locomotive import Locomotive


class ElectricTrain(Locomotive):
    def __init__(self, model, max_speed, passenger_capacity):
        super().__init__(model, max_speed)
        self.passenger_capacity = passenger_capacity
        self._passenger_num = 0

    def load_passenger(self, count):
        if self._passenger_num + count < self.passenger_capacity:
            self._passenger_num += count

    def unload_passengers(self, count):
        if self._passenger_num - count < 0:
            self._passenger_num -= count

    def get_passenger_count(self):
        return self._passenger_num

    def get_passenger_capacity(self):
        return self.passenger_capacity
    