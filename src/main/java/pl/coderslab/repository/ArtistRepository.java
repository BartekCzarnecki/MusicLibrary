package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.model.Artist;

import java.util.List;

public interface ArtistRepository extends JpaRepository <Artist, Long> {

    List <Artist> findArtistsByName (String name);

}
