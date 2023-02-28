package br.com.beganinha.springframework.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    private String id;

    private String name;

    private String email;
    
    private List<Roles> roles;

}
