package br.com.beganinha.springframework.service;

import br.com.beganinha.springframework.entity.Users;
import br.com.beganinha.springframework.repository.UsersRepositoryMongodb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UsersRepositoryMongodb usersRepositoryMongodb;

    public List<Users> getAllUsers() {
        return usersRepositoryMongodb.findAll();
    }



}
