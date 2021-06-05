package pl.coderslab.service;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pl.coderslab.model.Rental;
import pl.coderslab.repository.RentalRepository;

import java.util.List;
import java.util.Optional;

@Service
//@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RentalService implements RentalServiceInterface{

    private final RentalRepository rentalRepository;

    public RentalService(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }


    @Override
    public List<Rental> all() {
        return rentalRepository.findAll();
    }

    @Override
    public void add(Rental rental) {
        rentalRepository.save(rental);
    }

    @Override
    public Optional<Rental> get(Long id) {
        return rentalRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        rentalRepository.deleteById(id);
    }
}
