package Modules;

import java.util.List;

public class ParkingSlot extends BaseModal {
    private int SlotNumber;
    private List<VehicleType> vehicleType;
    private ParkingSlotStatus parkingSlotStatus;
    private ParkingFloor parkingFloor;

    public int getSlotNumber() {
        return SlotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        SlotNumber = slotNumber;
    }

    public List<VehicleType> getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(List<VehicleType> vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
