package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.model.Rental;

public interface RentalRepository extends JpaRepository<Rental, Long> {

}
