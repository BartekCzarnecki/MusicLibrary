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
public class ArtistService implements ArtistServiceInterface{

    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Artist> all() {
        return artistRepository.findAll();
    }

    @Override
    public void add(Artist artist) {
        artistRepository.save(artist);
    }

    @Override
    public void delete(Long id) {
        artistRepository.deleteById(id);
    }
}
