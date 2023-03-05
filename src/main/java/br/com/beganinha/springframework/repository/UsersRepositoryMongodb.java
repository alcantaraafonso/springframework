package br.com.beganinha.springframework.repository;

import br.com.beganinha.springframework.entity.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepositoryMongodb extends MongoRepository<Users, String> {

    Users findByEmail(String email);

    Users findByNameIgnoreCase(String name);

    @Query("{ 'email' : ?0 }")
    Users findByEmailQualquerCoisa(String email);

}
