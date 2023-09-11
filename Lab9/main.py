from LAB9 import electric_train  # імпорт пакету

# точка входу в програму
if __name__ == "__main__":
    intersiti = electric_train.ElectricTrain('Intersiti', 200, 500)
    intersiti.start()
    intersiti.load_passenger(200)
    print(intersiti.get_passenger_count())
    intersiti.load_passenger(20)
    print(intersiti.get_passenger_count())

    ukrzal = electric_train.ElectricTrain("UkrZaliznitsa", 120, 700)
    ukrzal.set_speed(30)
    ukrzal.set_speed(40)
    print(ukrzal.get_current_speed())

    intersiti.unload_passengers(30)
    print(intersiti.get_passenger_count())
