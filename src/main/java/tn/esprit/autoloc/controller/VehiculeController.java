
package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.service.IVehiculeService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/vehicule")
public class VehiculeController {

    private final IVehiculeService vehiculeService;

    @GetMapping("/allVehicules")
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicule();
    }

    @PostMapping("/ajouterVehicule")
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.addVehicule(vehicule);
    }

    @PutMapping("/modifierVehicule")
    public Vehicule modifierVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.updateVehicule(vehicule);
    }

    @GetMapping("/afficherVehicule/{id}")
    public Vehicule afficherVehicule(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id);
    }

    @DeleteMapping("/deleteVehicule/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.deleteVehicule(id);
    }
}
