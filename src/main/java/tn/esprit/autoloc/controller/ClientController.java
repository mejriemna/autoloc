
package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.IClientService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/client")
public class ClientController {

    private final IClientService clientService;

    @GetMapping("/allClients")
    public List<Client> getAllClients() {
        return clientService.afficherAllClient();
    }

    @PostMapping("/ajouterClient")
    public Client ajouterClient(@RequestBody Client client) {
        return clientService.ajouterClient(client);
    }

    @PutMapping("/modifierClient")
    public Client modifierClient(@RequestBody Client client) {
        return clientService.modifierClient(client);
    }

    @GetMapping("/afficherClient/{id}")
    public Client afficherClient(@PathVariable Long id) {
        return clientService.afficherClientById(id);
    }

    @DeleteMapping("/deleteClient/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.supprimerClient(id);
    }
}
