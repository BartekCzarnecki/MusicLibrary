package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.coderslab.model.User;

public interface UserRepository extends JpaRepository <User, Long> {

    User findByLogin (String login);

    @Query("SELECT u.id FROM User u WHERE u.login = :name")
    Long findIdByLogin (@Param("name") String name);

}
