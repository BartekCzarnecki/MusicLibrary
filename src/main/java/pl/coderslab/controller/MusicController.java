package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Music;
import pl.coderslab.service.MusicService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/music")
public class MusicController {

    private final MusicService musicService;

    public MusicController(MusicService musicService) {
        this.musicService = musicService;
    }

    @GetMapping("/all")
    public String allMusic (Model model) {
        List<Music> music = musicService.allMusic();
        model.addAttribute("allMusic", music);
        return "allMusic";
    }

    @GetMapping("/show/{id}")
    public String showAlbum (Model model, @PathVariable Long id) {
        model.addAttribute("album", musicService.getMusic(id));
        return "showAlbum";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showForm (Model model) {
        model.addAttribute("album", new Music());
        return "addFormAlbum";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addAlbumForm (@Valid @ModelAttribute Music music, BindingResult result){
        if (result.hasErrors()){
            return "addFormAlbum";
        }
        musicService.add(music);
        return "redirect: /music/all";
    }

    @GetMapping ("/delete/{id}")
    public String deleteAlbum (@PathVariable Long id) {
        musicService.delete(id);
        return "redirect: /music/all";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateAlbum (@Valid @ModelAttribute Music music, BindingResult result) {
        if (result.hasErrors()){
            return "updateAlbum";
        }
        musicService.add(music);
        return "redirect: /music/all";
    }

}
