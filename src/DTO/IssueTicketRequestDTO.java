package DTO;


import Modules.VehicleType;

public class IssueTicketRequestDTO {
    private VehicleType vehicleType;
    private String vehicleOwnerName;
    private String vehicleNumber;
    private Long gateId;

    public IssueTicketRequestDTO(VehicleType vehicleType, String vehicleOwnerName, String vehicleNumber, Long gateId) {
        this.vehicleType = vehicleType;
        this.vehicleOwnerName = vehicleOwnerName;
        this.vehicleNumber = vehicleNumber;
        this.gateId = gateId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleOwnerName() {
        return vehicleOwnerName;
    }

    public void setVehicleOwnerName(String vehicleOwnerName) {
        this.vehicleOwnerName = vehicleOwnerName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }
}
