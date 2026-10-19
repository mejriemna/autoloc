
package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.IAgenceService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/agence")
public class AgenceController {

    private final IAgenceService agenceService;

    @GetMapping("/allAgences")
    public List<Agence> getAllAgences() {
        return agenceService.getAgences();
    }

    @PostMapping("/ajouterAgence")
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return agenceService.addAgence(agence);
    }

    @PutMapping("/modifierAgence")
    public Agence modifierAgence(@RequestBody Agence agence) {
        return agenceService.updateAgence(agence);
    }

    @GetMapping("/afficherAgence/{id}")
    public Agence afficherAgence(@PathVariable Long id) {
        return agenceService.getAgenceById(id);
    }

    @DeleteMapping("/deleteAgence/{id}")
    public void deleteAgence(@PathVariable Long id) {
        agenceService.deleteAgence(id);
    }
}
