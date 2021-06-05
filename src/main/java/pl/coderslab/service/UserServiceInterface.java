package pl.coderslab.service;

import pl.coderslab.model.Music;
import pl.coderslab.model.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {

    List<User> all();

    void add (User user);

    Optional<User> get(Long id);

    void delete (Long id);

}
