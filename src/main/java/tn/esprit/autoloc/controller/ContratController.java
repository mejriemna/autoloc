package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.service.IContratService;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@AllArgsConstructor
@RestController
@RequestMapping("/contrat")
public class ContratController {

    private final IContratService contartService;
    @GetMapping("/allContrats")
    public List<Contrat> getAllContrats(){
        return contartService.afficherAllContrat();
    }
    @PostMapping("/ajouterContrat")
    public Contrat ajouterContrat(@RequestBody Contrat contrat){
        return contartService.ajouterContrat(contrat);
    }
    @PutMapping("/modifierContrat")
    public Contrat modifierContrat(@RequestBody Contrat contrat){
        return contartService.modifierContrat(contrat);
    }
    @GetMapping("/afficherContrat/{id}")
    public Contrat afficherContrat(@PathVariable Long id){
        return contartService.afficherContratById(id);
    }
    @DeleteMapping("/deleteContrat/{id}")
    public void deleteContrat(@PathVariable Long id){
        contartService.supprimerContrat(id);
    }


}
