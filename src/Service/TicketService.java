package Service;

import Modules.*;
import Repository.GateRepository;
import Repository.ParkingLotRepository;
import Repository.TicketRepository;
import Repository.VehicleRepository;
import Stratorgies.FactoryForSpotAssignment;
import Stratorgies.SlotAssignmentStrategy;
import exception.GateNotFoundException;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private VehicleRepository vehicleRepository;
    private GateRepository gateRepository;
    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;

    public TicketService(VehicleRepository vehicleRepository,
                         GateRepository gateRepository,
                         TicketRepository ticketRepository,
                         ParkingLotRepository parkingLotRepository) {
        this.vehicleRepository = vehicleRepository;
        this.gateRepository = gateRepository;
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Ticket issueTicket(VehicleType vehicleType,
                              String vehicleNumber,
                              String vehicleOwner,
                              Long gateId) throws GateNotFoundException {
/*
        Create a ticket Object
        Get vehicle object from DB if present, if not create it and save it to DB
        Assign Slot
        save to Ticket to DB

*/
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> gateOptional = gateRepository.FindGateById(gateId);
        if(gateOptional.isEmpty()){
            throw new GateNotFoundException();
        }
        Gate gate = new Gate();
        ticket.setGate(gate);
        ticket.setGeneratedBy(gate.getOperator());


        Vehicle saveVahicle;
        Optional<Vehicle> optionalVehicle = vehicleRepository.getVahicleByNumber(vehicleNumber);

        if(optionalVehicle.isEmpty()){
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicle.setVehicleOwnerName(vehicleOwner);

            saveVahicle = vehicleRepository.saveVehicle(vehicle);
        }else{
            saveVahicle = optionalVehicle.get();
        }

        ticket.setVehicle(saveVahicle);


       SlotAllotmentStrategyType slotAllotmentStrategyType =
               parkingLotRepository.FindParkingLotByGate(gate).getSlotAllotmentStratorgyType();

        SlotAssignmentStrategy slotAssignmentStrategy =
                FactoryForSpotAssignment.getSlotForType(slotAllotmentStrategyType);

        ticket.setParkingSlot(slotAssignmentStrategy.getSpot(vehicleType));

        Ticket saveTicket = ticketRepository.saveTicket(ticket);

        return saveTicket;
    }
}
