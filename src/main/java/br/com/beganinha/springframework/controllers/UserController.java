package br.com.beganinha.springframework.controllers;

import br.com.beganinha.springframework.repository.UsersRepositoryMongodb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UsersRepositoryMongodb usersRepositoryMongodb;

    @GetMapping("/user")
    public String getUsers(Model model) {
        model.addAttribute("userList", usersRepositoryMongodb.findAll());

        return "user";
    }

}
