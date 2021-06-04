package pl.coderslab.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.model.Music;
import pl.coderslab.repository.MusicRepository;

import java.util.List;
import java.util.Optional;

@Primary
@Service
//@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MusicService implements MusicServiceInterface {

    private final MusicRepository musicRepository;

    public MusicService(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    @Override
    public List<Music> all() {
        return musicRepository.findAll();
    }

    @Override
    public void add(Music music) {
        musicRepository.save(music);
    }

    @Override
    public Optional<Music> get(Long id) {
        return musicRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        musicRepository.deleteById(id);
    }


//    public void update(Music music) {
//        musicRepository.save(music);
//    }
}
