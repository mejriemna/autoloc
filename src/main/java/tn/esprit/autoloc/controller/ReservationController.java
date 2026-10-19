
package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.service.IReservationService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private final IReservationService reservationService;

    @GetMapping("/allReservations")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @PostMapping("/ajouterReservation")
    public Reservation ajouterReservation(
            @RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @PutMapping("/modifierReservation")
    public Reservation modifierReservation(
            @RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @GetMapping("/afficherReservation/{id}")
    public Reservation afficherReservation(@PathVariable Long id) {
        return reservationService.getReservationById(id);
    }

    @DeleteMapping("/deleteReservation/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }
}
