package pl.coderslab.service;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pl.coderslab.model.Artist;
import pl.coderslab.repository.ArtistRepository;

import java.util.List;
import java.util.Optional;

@Service
//@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public List<Artist> allArtist() {
        return artistRepository.findAll();
    }

    public Artist getArtist(Long id) {
        return artistRepository.getOne(id);
    }

    public List<Artist> findByName (String name) {
        return artistRepository.findArtistsByName(name);
    }

}
