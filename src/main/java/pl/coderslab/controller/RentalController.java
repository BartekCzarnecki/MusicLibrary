package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.model.Artist;
import pl.coderslab.model.Rental;
import pl.coderslab.service.RentalService;

import java.util.List;

@Controller
@RequestMapping ("/rental")
public class RentalController {

    private final RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping("/all")
    public String allRentals (Model model) {
        List<Rental> rentals = rentalService.allRentals();
        model.addAttribute("allRental", rentals);
        return "allRental";
    }

    @RequestMapping(value = {"/{id}"})
    public String getRental (Model model, @PathVariable Long id) {
        model.addAttribute("rental", rentalService.getRental(id));
        return "showRental";
    }
}
