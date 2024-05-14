package com.spacetravel;

public class TestApplication {
    public static void main(String[] args) {
        ClientCrudService clientService = new ClientCrudService();
        PlanetCrudService planetService = new PlanetCrudService();

        // Create and save a new client
        Client client = new Client();
        client.setName("Test Client");
        clientService.save(client);

        // Create and save a new planet
        Planet planet = new Planet();
        planet.setId("PLT1");
        planet.setName("Test Planet");
        planetService.save(planet);

        // Retrieve and print the client
        Client retrievedClient = clientService.get(client.getId());
        System.out.println("Retrieved Client: " + retrievedClient.getName());

        // Retrieve and print the planet
        Planet retrievedPlanet = planetService.get(planet.getId());
        System.out.println("Retrieved Planet: " + retrievedPlanet.getName());

        // Update the client
        retrievedClient.setName("Updated Client");
        clientService.update(retrievedClient);

        // Update the planet
        retrievedPlanet.setName("Updated Planet");
        planetService.update(retrievedPlanet);

        // Delete the client
        clientService.delete(retrievedClient);

        // Delete the planet
        planetService.delete(retrievedPlanet);
    }
}
