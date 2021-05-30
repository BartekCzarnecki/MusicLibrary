package pl.coderslab.controller;

import com.fasterxml.classmate.Annotations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.model.Artist;
import pl.coderslab.model.Music;
import pl.coderslab.service.ArtistService;

import java.util.List;

@Controller
@RequestMapping("/artist")
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/all")
    public String allArtist (Model model) {
        List<Artist> artist = artistService.allArtist();
        model.addAttribute("allArtist", artist);
        return "allArtist";
    }

    @RequestMapping(value = {"/{id}"})
    public String getArtist (Model model, @PathVariable Long id) {
        model.addAttribute("atist", artistService.getArtist(id));
        return "showArtist";
    }

    @RequestMapping(value = {"/name"})
    public String artistByName (Model model, @PathVariable String name) {
        model.addAttribute("artist", artistService.findByName(name));
        return "showArtistByName";
    }

}
