package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.model.Music;

import java.util.List;
import java.util.Optional;

public interface MusicRepository extends JpaRepository <Music, Long> {

}
