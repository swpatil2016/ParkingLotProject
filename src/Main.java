import Controller.TicketController;
import DTO.IssueTicketRequestDTO;
import DTO.IssueTicketResponseDTO;
import Modules.Ticket;
import Modules.VehicleType;
import Repository.GateRepository;
import Repository.ParkingLotRepository;
import Repository.TicketRepository;
import Repository.VehicleRepository;
import Service.TicketService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Here order metter the object creation done according to dependency of class.
        // Like Repository class not any object so we create them first -> Ticket service need repository objects
        // so we created service after repository -> controller depends upon service object so we create it after
        // service. NOTE :- All this object creation are take care by Spring Boot and we call it dependency
        // injection
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new
                TicketService(vehicleRepository,gateRepository,ticketRepository, parkingLotRepository);

        TicketController ticketController = new TicketController(ticketService);

        // Take input from user :-
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vehicle Number");
        String number = sc.next();
        System.out.println("Enter Vahicle owner name");
        String name = sc.next();
        System.out.println("Enter Gate Id");
        Long id = sc.nextLong();
        System.out.println("Enter the vehicle type");
        String type = sc.next();
        VehicleType vehicleType = VehicleType.valueOf(type);

        IssueTicketRequestDTO requestDTO = new IssueTicketRequestDTO(
                vehicleType, name, number, id
        );

        IssueTicketResponseDTO responseDTO =  ticketController.issueTicket(requestDTO);
        Ticket ticket = responseDTO.getTicket();

        // Give ticket to client;
        System.out.println(ticket);

    }
}
