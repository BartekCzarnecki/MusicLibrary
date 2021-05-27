package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.model.Music;

public interface MusicRepository extends JpaRepository <Music, Long> {

}
