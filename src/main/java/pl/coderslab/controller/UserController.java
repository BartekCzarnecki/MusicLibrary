package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Music;
import pl.coderslab.model.User;
import pl.coderslab.service.UserService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public String allUser (Model model) {
        List<User> users = userService.allUsers();
        model.addAttribute("allUsers", users);
        return "allUsers";
    }

    @GetMapping("/show/{id}")
    public String showUser (Model model, @PathVariable Long id) {
        model.addAttribute("user", userService.getUser(id));
        return "showUser";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showFormUser (Model model) {
        model.addAttribute("user", new User());
        return "addFormUser";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addFormUser (@Valid @ModelAttribute User user, BindingResult result){
        if (result.hasErrors()){
            return "addFormUser";
        }
        userService.add(user);
        return "redirect: /user/all";
    }

    @GetMapping ("/delete/{id}")
    public String deleteUser (@PathVariable Long id) {
        userService.delete(id);
        return "redirect: /user/all";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser (@Valid @ModelAttribute User user, BindingResult result) {
        if (result.hasErrors()){
            return "updateUser";
        }
        userService.add(user);
        return "redirect: /user/all";
    }
}
