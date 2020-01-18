package repositoryManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import repositoryManager.model.UserModel;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/user")
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping
    public String registerProcessing(@Valid UserModel userModel, Errors errors) {
        if (errors.hasErrors()) {
            return "registration";
        }
        // or save a new user in DB
        return "redirect:/home";
    }
}
