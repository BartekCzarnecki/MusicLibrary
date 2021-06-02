package pl.coderslab.service;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pl.coderslab.model.Rental;
import pl.coderslab.repository.RentalRepository;

import java.util.List;

@Service
@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
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
