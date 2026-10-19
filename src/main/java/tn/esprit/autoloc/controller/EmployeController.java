
package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.service.IEmployeService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/employe")
public class EmployeController {

    private final IEmployeService employeService;

    @GetMapping("/allEmployes")
    public List<Employe> getAllEmployes() {
        return employeService.getEmployes();
    }

    @PostMapping("/ajouterEmploye")
    public Employe ajouterEmploye(@RequestBody Employe employe) {
        return employeService.addEmploye(employe);
    }

    @PutMapping("/modifierEmploye")
    public Employe modifierEmploye(@RequestBody Employe employe) {
        return employeService.updateEmploye(employe);
    }

    @GetMapping("/afficherEmploye/{id}")
    public Employe afficherEmploye(@PathVariable Long id) {
        return employeService.getEmpById(id);
    }

    @DeleteMapping("/deleteEmploye/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }
}
