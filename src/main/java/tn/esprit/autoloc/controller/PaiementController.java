
package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.service.IPaiementService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/paiement")
public class PaiementController {

    private final IPaiementService paiementService;

    @GetMapping("/allPaiements")
    public List<Paiement> getAllPaiements() {
        return paiementService.getAllPaiements();
    }

    @PostMapping("/ajouterPaiement")
    public Paiement ajouterPaiement(@RequestBody Paiement paiement) {
        return paiementService.addPaiement(paiement);
    }

    @PutMapping("/modifierPaiement")
    public Paiement modifierPaiement(@RequestBody Paiement paiement) {
        return paiementService.updatePaiement(paiement);
    }

    @GetMapping("/afficherPaiement/{id}")
    public Paiement afficherPaiement(@PathVariable Long id) {
        return paiementService.getPaiementById(id);
    }

    @DeleteMapping("/deletePaiement/{id}")
    public void deletePaiement(@PathVariable Long id) {
        paiementService.deletePaiement(id);
    }
}
