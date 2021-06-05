package pl.coderslab.controller;

import com.fasterxml.classmate.Annotations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Artist;
import pl.coderslab.service.ArtistService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/artist")
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showFormArtist (Model model) {
        model.addAttribute("artist", new Artist());
        return "addArtist";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addFormArtist (@Valid @ModelAttribute Artist artist, BindingResult result){
        if (result.hasErrors()){
            return "addArtist";
        }
        artistService.add(artist);
        return "redirect:/artist/all";
    }

    @GetMapping("/all")
    public String allArtist (Model model) {
        List<Artist> artist = artistService.all();
        model.addAttribute("allArtist", artist);
        return "allArtist";
    }

    @GetMapping ("/delete/{id}")
    public String deleteArtist (@PathVariable long id) {
        artistService.delete(id);
        return "redirect:/artist/all";
    }

//    @RequestMapping(value = {"/{id}"})
//    public String getArtist (Model model, @PathVariable Long id) {
//        model.addAttribute("atist", artistService.getArtist(id));
//        return "showArtist";
//    }
//
//    @RequestMapping(value = {"/name"})
//    public String artistByName (Model model, @PathVariable String name) {
//        model.addAttribute("artist", artistService.findByName(name));
//        return "showArtistByName";
//    }

}
