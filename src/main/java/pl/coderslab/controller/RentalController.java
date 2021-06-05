package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Music;
import pl.coderslab.model.Rental;
import pl.coderslab.model.User;
import pl.coderslab.service.MusicService;
import pl.coderslab.service.RentalService;
import pl.coderslab.service.UserService;

import javax.validation.Valid;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping ("/rental")
public class RentalController {

    private final RentalService rentalService;
    private final MusicService musicService;
    private final UserService userService;

    public RentalController(RentalService rentalService, MusicService musicService, UserService userService) {
        this.rentalService = rentalService;
        this.musicService = musicService;
        this.userService = userService;
    }

    @GetMapping("/all")
    public String allRentals (Model model) {
        List<Rental> rentals = rentalService.all();
        model.addAttribute("allRental", rentals);
        return "allRental";
    }

    @GetMapping ("/delete/{id}")
    public String deleteAlbum (@PathVariable long id) {
        rentalService.delete(id);
        return "redirect:/rental/all";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String showUpdateForm(@PathVariable long id, Model model) {
//        httpSession.getAttribute("user_id");
//        Music music = musicService.getMusic(id);
//        System.out.println(music);
        model.addAttribute("rent", rentalService.get(id));
        return "rentUpdate";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateAlbum (@Valid Rental rental, BindingResult result) {
        if (result.hasErrors()){
            return "rentUpdate";
        }
        rentalService.add(rental);
        return "redirect:/rental/all";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showForm (Model model) {
        model.addAttribute("rental", new Rental());
        return "addRentForm";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addAlbumForm (@Valid @ModelAttribute Rental rental, BindingResult result){
        if (result.hasErrors()){
            return "addRentForm";
        }
        rentalService.add(rental);
        return "redirect:/rental/all";
    }

    @ModelAttribute("users")
    public Collection<User> users() {
        return userService.all();
    }

    @ModelAttribute("albums")
    public List<Music> albums() {
        return musicService.all();
    }


//    @RequestMapping(value = {"/{id}"})
//    public String getRental (Model model, @PathVariable Long id) {
//        model.addAttribute("rental", rentalService.getRental(id));
//        return "showRental";
//    }
}
