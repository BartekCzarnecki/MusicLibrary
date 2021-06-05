package pl.coderslab.service;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pl.coderslab.model.User;
import pl.coderslab.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
//@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserService implements UserServiceInterface{

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByLogin (String login) {
        return userRepository.findByLogin(login);
    }

    public Long findIdByLogin (String login){
        return userRepository.findIdByLogin(login);
    }

    @Override
    public List<User> all() {
        return userRepository.findAll();
    }

    @Override
    public void add(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> get(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
