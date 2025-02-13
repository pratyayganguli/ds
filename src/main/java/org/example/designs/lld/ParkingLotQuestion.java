package org.example.designs.lld;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// since we are not storing the data this parking lot data should be singleton by nature

class ParkingLotData {

    private static ParkingLotData instance;
    private Map<Integer, String> data;
    // private access specifier set to the parking lot data

    private ParkingLotData() {
        data = new HashMap<>();
    }

    public static ParkingLotData getInstance() {
        if(instance == null) {
            instance = new ParkingLotData();
        }
        return instance;
    }

    public boolean isSlotOccupied(int key) {
        return data.containsKey(key);
    }

    public void setSlot(int key, String vehicleId) {
       data.put(key, vehicleId);
    }

    public void unSetSlot(int key) {
        data.remove(key);
    }
}

class Vehicle {
    private String id;
    private String vehicleNumber;
    private String driverLicenseId;
    private int slot;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getDriverLicenseId() {
        return driverLicenseId;
    }

    public void setDriverLicenseId(String driverLicenseId) {
        this.driverLicenseId = driverLicenseId;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
}

class VehicleOperations {
    Vehicle park(Vehicle vehicle) {
        for (int i = 1; i < 101 ; i++) {
            if(!ParkingLotData.getInstance().isSlotOccupied(i)) {
                vehicle.setSlot(i);
                System.out.println("vehicle parked!");
                ParkingLotData.getInstance().setSlot(i, vehicle.getId());
                break;
            }
        }
        if(vehicle.getSlot() == 0) {
            throw new RuntimeException("could not find a spot!");
        }
        return vehicle;
    }

    void unPark(Vehicle vehicle) {
        ParkingLotData.getInstance().unSetSlot(vehicle.getSlot());
    }
}


class ParkingLotQuestion {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setDriverLicenseId(UUID.randomUUID().toString());
        vehicle.setId(UUID.randomUUID().toString());
        vehicle.setVehicleNumber(UUID.randomUUID().toString());
        VehicleOperations vehicleOperations = new VehicleOperations();
        vehicle = vehicleOperations.park(vehicle);
        vehicleOperations.unPark(vehicle);
    }
}
