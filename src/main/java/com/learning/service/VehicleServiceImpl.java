package com.learning.service;

import com.learning.model.Vehicle;
import com.learning.repository.GenericCrudRepository;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class VehicleServiceImpl implements VehicleService {

    GenericCrudRepository<Vehicle> vehicleDao = new GenericCrudRepository<>();

    @Override
    public void createVehicle(Vehicle vehicle, List<Vehicle> vehicleList) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("ID:");
        vehicle.setId(scan.nextInt());
        System.out.println("Vehicle Name:");
        vehicle.setVehicleName(scan.next());
        System.out.println("Vehicle Type:");
        vehicle.setVehicleType(scan.next());
        System.out.println("Vehicle Cost:");
        vehicle.setVehicleCost(scan.nextInt());
        vehicle.setCreatedAt(new Date());
        vehicle.setCreatedBy("system");
        vehicleDao.create(vehicle, vehicleList);
    }
    // update user method
    // create method improve update read delete

    @Override
    public void display(int id, List<Vehicle> vehicleList) {
        vehicleDao.display(id, vehicleList);
    }

    @Override
    public void displayAll(List<Vehicle> vehicleList) {
        System.out.println(vehicleList.toString());
    }

    @Override
    public void updateVehicle(int id, List<Vehicle> vehicleList) {
//       vehicleDao.update(id, vehicleList);
    }

    @Override
    public void deleteVehicle(int id, List<Vehicle> vehicleList) {
        if (id < vehicleList.size()) {
            vehicleList.remove(id);
        } else {
            System.out.println("ID does not exist.");
        }
    }

}
