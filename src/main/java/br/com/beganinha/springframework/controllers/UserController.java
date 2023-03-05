package br.com.beganinha.springframework.controllers;

import br.com.beganinha.springframework.repository.UsersRepositoryMongodb;
import br.com.beganinha.springframework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String getAllUsers(Model model) {
        model.addAttribute("userList", userService.getAllUsers());

        return "user";
    }

}
