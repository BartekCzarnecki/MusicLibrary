package pl.coderslab.service;

import pl.coderslab.model.Rental;
import pl.coderslab.repository.RentalRepository;

import java.util.List;

public class RentalService{

    private final RentalRepository rentalRepository;

    public RentalService(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }

    public List<Rental> allRentals() {
        return rentalRepository.findAll();
    }

    public Rental getRental(Long id) {
        return rentalRepository.getOne(id);
    }
}
