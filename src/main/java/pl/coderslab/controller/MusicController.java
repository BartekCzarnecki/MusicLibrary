package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Artist;
import pl.coderslab.model.Music;
import pl.coderslab.service.ArtistService;
import pl.coderslab.service.MusicService;
import pl.coderslab.service.UserService;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/music")
public class MusicController {

    private final MusicService musicService;
    private final ArtistService artistService;
    private final UserService userService;


    public MusicController(MusicService musicService, ArtistService artistService, UserService userService) {
        this.musicService = musicService;
        this.artistService = artistService;
        this.userService = userService;
    }

    @GetMapping("/all")
    public String allMusic (Model model) {
        List<Music> music = musicService.all();
        model.addAttribute("allMusic", music);
        return "allMusic";
    }

    @GetMapping("/show/{id}")
    public String showAlbum (Model model, @PathVariable long id) {
        model.addAttribute("music", musicService.get(id).orElseThrow(EntityNotFoundException::new));
        return "album";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showForm (Model model) {
        model.addAttribute("music", new Music());
        return "addFormAlbum";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addAlbumForm (@ModelAttribute @Valid Music music, BindingResult result){
        if (result.hasErrors()){
            return "addFormAlbum";
        }
        musicService.add(music);
        return "redirect:/music/all";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String showUpdateForm(@PathVariable long id, Model model) {
//        httpSession.getAttribute("user_id");
//        Music music = musicService.getMusic(id);
//        System.out.println(music);
        model.addAttribute("music", musicService.get(id));
        return "update";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateAlbum (@Valid Music music, BindingResult result) {
        if (result.hasErrors()){
            return "update";
        }
        musicService.add(music);
        return "redirect:/music/all";
    }

    @GetMapping ("/delete/{id}")
    public String deleteAlbum (@PathVariable long id) {
        musicService.delete(id);
        return "redirect:/music/all";
    }

    @ModelAttribute("artists")
    public List<Artist> artists() {
        return artistService.all();
    }



}
