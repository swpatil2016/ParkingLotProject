package Modules;

import java.util.List;

public class ParkingLot extends BaseModal {
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private ParkingLotStatus parkingLotStatus;
    private String address;
    private FeeCalcutationStratorgyType feeCalcutationStratorgyType;
    private SlotAllotmentStrategyType slotAllotmentStratorgyType;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public FeeCalcutationStratorgyType getFeeCalcutationStratorgyType() {
        return feeCalcutationStratorgyType;
    }

    public void setFeeCalcutationStratorgyType(FeeCalcutationStratorgyType feeCalcutationStratorgyType) {
        this.feeCalcutationStratorgyType = feeCalcutationStratorgyType;
    }

    public SlotAllotmentStrategyType getSlotAllotmentStratorgyType() {
        return slotAllotmentStratorgyType;
    }

    public void setSlotAllotmentStratorgyType(SlotAllotmentStrategyType slotAllotmentStratorgyType) {
        this.slotAllotmentStratorgyType = slotAllotmentStratorgyType;
    }
}
