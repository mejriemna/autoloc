
package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.service.IMaintenanceService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/maintenance")
public class MaintenanceController {

    private final IMaintenanceService maintenanceService;

    @GetMapping("/allMaintenances")
    public List<Maintenance> getAllMaintenances() {
        return maintenanceService.getAllMaintenances();
    }

    @PostMapping("/ajouterMaintenance")
    public Maintenance ajouterMaintenance(
            @RequestBody Maintenance maintenance) {
        return maintenanceService.addMaintenance(maintenance);
    }

    @PutMapping("/modifierMaintenance")
    public Maintenance modifierMaintenance(
            @RequestBody Maintenance maintenance) {
        return maintenanceService.updateMaintenance(maintenance);
    }

    @GetMapping("/afficherMaintenance/{id}")
    public Maintenance afficherMaintenance(@PathVariable Long id) {
        return maintenanceService.getMaintenanceById(id);
    }

    @DeleteMapping("/deleteMaintenance/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.deleteMaintenance(id);
    }
}
