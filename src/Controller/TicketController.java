package Controller;

import DTO.IssueTicketRequestDTO;
import DTO.IssueTicketResponseDTO;
import DTO.ResponseStatus;
import Modules.Ticket;
import Service.TicketService;
import exception.GateNotFoundException;


public class TicketController {
    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO issueTicketRequestDTO) {

        IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO();
        Ticket ticket;
        try {
             ticket = ticketService.issueTicket(  issueTicketRequestDTO.getVehicleType(),
                    issueTicketRequestDTO.getVehicleNumber(),
                    issueTicketRequestDTO.getVehicleOwnerName(),
                    issueTicketRequestDTO.getGateId());
        }catch (Exception e){
            responseDTO.setResponseStatus(ResponseStatus.FAIL);
            responseDTO.setErrorMassage("Something went wrong");
            return responseDTO;
        }
        responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        responseDTO.setTicket(ticket);


        return responseDTO;
    }
}
