package com.learning.service;

import com.learning.model.Vehicle;

import java.util.List;

public interface VehicleService {
    void createVehicle(Vehicle vehicle, List<Vehicle> vehicleList);

    void display(int id, List<Vehicle> vehicleList);

    void displayAll(List<Vehicle> vehicleList);

    void updateVehicle(int id, List<Vehicle> vehicleList);

    void deleteVehicle(int id, List<Vehicle> vehicleList);
}
