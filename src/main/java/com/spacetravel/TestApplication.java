package com.spacetravel;

import java.time.LocalDateTime;

public class TestApplication {
    public static void main(String[] args) {
        ClientCrudService clientService = new ClientCrudService();
        PlanetCrudService planetService = new PlanetCrudService();
        TicketCrudService ticketService = new TicketCrudService();

        // Create and save a new client
        Client client = new Client();
        client.setName("Test Client");
        clientService.save(client);

        // Create and save new planets
        Planet fromPlanet = new Planet();
        fromPlanet.setId("PLT1");
        fromPlanet.setName("From Planet");
        planetService.save(fromPlanet);

        Planet toPlanet = new Planet();
        toPlanet.setId("PLT2");
        toPlanet.setName("To Planet");
        planetService.save(toPlanet);

        // Create and save a new ticket
        Ticket ticket = new Ticket();
        ticket.setCreatedAt(LocalDateTime.now());
        ticket.setClient(client);
        ticket.setFromPlanet(fromPlanet);
        ticket.setToPlanet(toPlanet);
        ticketService.save(ticket);

        // Retrieve and print the ticket
        Ticket retrievedTicket = ticketService.get(ticket.getId());
        System.out.println("Retrieved Ticket: " + retrievedTicket.getId());

        // Update the ticket
        retrievedTicket.setToPlanet(fromPlanet);
        ticketService.update(retrievedTicket);

        // Delete the ticket
        ticketService.delete(retrievedTicket);

        // Clean up
        clientService.delete(client);
        planetService.delete(fromPlanet);
        planetService.delete(toPlanet);
    }
}
