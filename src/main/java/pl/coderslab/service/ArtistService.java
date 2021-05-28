package pl.coderslab.service;

import pl.coderslab.model.Artist;
import pl.coderslab.repository.ArtistRepository;

import java.util.List;
import java.util.Optional;

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
}