package Repository;

import Modules.Gate;
import Modules.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    Map<Long, ParkingLot> parkingLotMap = new HashMap<>();

    public ParkingLot FindParkingLotByGate(Gate gate){

    for (ParkingLot parkingLot: parkingLotMap.values()){
        if(parkingLot.getGates().contains(gate)){
            return parkingLot;
        }
    }
        return null;
    }

}
