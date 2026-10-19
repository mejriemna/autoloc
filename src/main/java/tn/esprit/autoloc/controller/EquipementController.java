
package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.service.IEquipementService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/equipement")
public class EquipementController {

    private final IEquipementService equipementService;

    @GetMapping("/allEquipements")
    public List<Equipement> getAllEquipements() {
        return equipementService.getAllEquipement();
    }

    @PostMapping("/ajouterEquipement")
    public Equipement ajouterEquipement(
            @RequestBody Equipement equipement) {
        return equipementService.addEquipement(equipement);
    }

    @PutMapping("/modifierEquipement")
    public Equipement modifierEquipement(
            @RequestBody Equipement equipement) {
        return equipementService.updateEquipement(equipement);
    }

    @GetMapping("/afficherEquipement/{id}")
    public Equipement afficherEquipement(@PathVariable Long id) {
        return equipementService.getEquipement(id);
    }

    @DeleteMapping("/deleteEquipement/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementService.deleteEquipement(id);
    }
}
