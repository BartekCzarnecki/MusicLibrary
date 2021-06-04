package pl.coderslab.controller;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.context.annotation.SessionScope;
import pl.coderslab.model.User;
import pl.coderslab.service.UserService;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

//@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showFormUser (Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addFormUser (@Valid @ModelAttribute User user, BindingResult result){
        if (result.hasErrors()){
            return "registration";
        }
        userService.add(user);
        return "redirect: /user/login";
    }

    @GetMapping ("/delete/{id}")
    public String deleteUser (@PathVariable Long id) {
        userService.delete(id);
        return "redirect: /user/all";
    }
//
//    @RequestMapping(value = "/update", method = RequestMethod.POST)
//    public String updateUser (@Valid @ModelAttribute User user, BindingResult result) {
//        if (result.hasErrors()){
//            return "updateUser";
//        }
//        userService.add(user);
//        return "redirect: /user/all";
//    }
    @GetMapping("/login")
    public String showLoginForm (Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping ("/login")
    public String loginForm(HttpSession httpSession, @ModelAttribute User user) {
        if (httpSession.getAttribute("user_id") == null) {
            httpSession.setAttribute("user_id", userService.findIdByLogin(user.getLogin()));
            }
        return "redirect: /music/all";
    }



//    @GetMapping("/all")
//    public String allUser (Model model) {
//        List<User> users = userService.allUsers();
//        model.addAttribute("allUsers", users);
//        return "allUsers";
//    }
//
//    @GetMapping("/show/{id}")
//    public String showUser (Model model, @PathVariable Long id) {
//        model.addAttribute("user", userService.getUser(id));
//        return "showUser";
//    }


}
