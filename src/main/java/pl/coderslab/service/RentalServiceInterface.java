package pl.coderslab.service;

import pl.coderslab.model.Music;
import pl.coderslab.model.Rental;

import java.util.List;
import java.util.Optional;

public interface RentalServiceInterface {

    List<Rental> all();

    void add (Rental rental);

    Optional<Rental> get(Long id);

    void delete (Long id);

}
