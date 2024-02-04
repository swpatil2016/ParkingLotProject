package Stratorgies;

import Modules.ParkingSlot;
import Modules.VehicleType;

public interface SlotAssignmentStrategy {
    public ParkingSlot getSpot(VehicleType vehicleType);
}
