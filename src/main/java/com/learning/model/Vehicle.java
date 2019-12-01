package com.learning.model;


public class Vehicle extends Identity {
    private String vehicleType;
    private String vehicleName;
    private int vehicleCost;

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                "vehicleType='" + vehicleType + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleCost=" + vehicleCost +
                "createdBy='" + createdBy + '\'' +
                ", createdAt=" + createdAt +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedAt=" + updatedAt +
                '}';
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getVehicleCost() {
        return vehicleCost;
    }

    public void setVehicleCost(int vehicleCost) {
        this.vehicleCost = vehicleCost;
    }
}
