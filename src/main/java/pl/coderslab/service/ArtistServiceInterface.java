package pl.coderslab.service;

import pl.coderslab.model.Artist;
import pl.coderslab.model.Music;

import java.util.List;

public interface ArtistServiceInterface {

    List<Artist> all();

    void add (Artist artist);

    void delete (Long id);


}
