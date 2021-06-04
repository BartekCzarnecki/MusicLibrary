package pl.coderslab.service;

import pl.coderslab.model.Music;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

public interface MusicServiceInterface {

    List<Music> all();

    void add (Music music);

    Optional<Music> get(Long id);

    void delete (Long id);

}
