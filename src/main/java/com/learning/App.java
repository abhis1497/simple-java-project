package com.learning;

import com.learning.model.User;
import com.learning.model.Vehicle;
import com.learning.service.UserService;
import com.learning.service.UserServiceImpl;
import com.learning.service.VehicleService;
import com.learning.service.VehicleServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 * call kar ab kar khellooooooooooo
 */
public class App {
    static Scanner scan = new Scanner(System.in);
    static List<User> userList = new ArrayList<>();
    static List<Vehicle> vehicleList = new ArrayList<>();

    private VehicleService vehicleService = new VehicleServiceImpl();
    private UserService userService = new UserServiceImpl();
    static App app = new App();

    public void crudUser() {

        System.out.println("1.Create User\n2.Display User\n3.Update User\n4.Delete User\n5.Dislplay all users");
        int ch = scan.nextInt();
        switch (ch) {
            case 1:
                userService.createUser(new User(), userList);
                break;
            case 2:
                System.out.println("Enter User ID:");
                userService.display(scan.nextInt(), userList);
                break;
            case 3:
                System.out.println("Enter User ID:");
                userService.updateUser(scan.nextInt(), userList);
                break;
            case 4:
                System.out.println("Enter User ID:");
                userService.deleteUser(scan.nextInt(), userList);
                break;
            case 5:
                userService.displayAll(userList);
                break;

        }

    }

    public void crudVehicle() {


        System.out.println("1.Create Vehicle\n2.Display Vehicle\n3.Update Vehicle\n4.Delete Vehicle\n5.Dislplay all Vehicles");
        int ch = scan.nextInt();
        switch (ch) {
            case 1:
                vehicleService.createVehicle(new Vehicle(), vehicleList);
                break;
            case 2:
                System.out.println("Enter Vehicle ID:");
                vehicleService.display(scan.nextInt(), vehicleList);
                break;
            case 3:
                System.out.println("Enter Vehicle ID:");
                vehicleService.updateVehicle(scan.nextInt(), vehicleList);
                break;
            case 4:
                System.out.println("Enter Vehicle ID:");
                vehicleService.deleteVehicle(scan.nextInt(), vehicleList);
                break;
            case 5:
                vehicleService.displayAll(vehicleList);
                break;
        }

    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter Choice:\n1.User\n2.Vehicle\n3.Exit");
            int ch = scan.nextInt();
            switch (ch) {
                case 1:
                    app.crudUser();
                    break;
                case 2:
                    app.crudVehicle();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    System.exit(0);
            }
        }

    }
}
