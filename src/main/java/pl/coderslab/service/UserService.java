package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.model.User;
import pl.coderslab.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(Long id) {
        return userRepository.getOne(id);
    }

    public List<User> allUsers() {
        return userRepository.findAll();
    }

    public void add(User user) {
        userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public void update(User user) {
        userRepository.save(user);
    }

}
