package br.com.beganinha.springframework.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Roles {
    @Id
    private String id;

    private String name;
}
