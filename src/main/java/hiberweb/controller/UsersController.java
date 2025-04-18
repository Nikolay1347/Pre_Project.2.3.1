package hiberweb.controller;

import hiberweb.model.User;
import hiberweb.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class UsersController {

    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public String usersList(Model model) {

        model.addAttribute("list", userService.getListUsers());
        return "AllUsers";
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "new";
    }

    @PostMapping("/user")
    public String create(@ModelAttribute("user") User user) {
        userService.add(user);
        return "redirect:/";
    }


    @GetMapping("/delete")
    public String deleteUser(Model model) {
        model.addAttribute("user", new User());
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("user") User user) {
        userService.delete(user.getId());
        return "redirect:/";
    }


    @GetMapping("/update")
    public String updateUser(Model model) {
        model.addAttribute("user", new User());
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("user") User user) {
        userService.update(user);
        return "redirect:/";
    }
}
