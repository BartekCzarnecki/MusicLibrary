package pl.coderslab.service;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pl.coderslab.model.Music;
import pl.coderslab.repository.MusicRepository;

import java.util.List;
import java.util.Optional;

@Service
@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MusicService {

    private final MusicRepository musicRepository;

    public MusicService(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    public Music getMusic(Long id) {
        return musicRepository.getOne(id);
    }

    public List<Music> allMusic() {
        return musicRepository.findAll();
    }

    public void add(Music music) {
        musicRepository.save(music);
    }

    public void delete(Long id) {
        musicRepository.deleteById(id);
    }

//    public void update(Music music) {
//        musicRepository.save(music);
//    }
}
