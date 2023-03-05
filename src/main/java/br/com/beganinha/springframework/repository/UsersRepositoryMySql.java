package br.com.beganinha.springframework.repository;

import br.com.beganinha.springframework.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//@Repository - public interface UsersRepositoryMySql extends JpaRepository<Users, Long>
//Foi comentado para que o Spring suba somente o Repository do MongoDB
public interface UsersRepositoryMySql {

    /**
     * O JPA criará a consulta baseada na columa que foi colocada depois do findBy
     * Neste caso, o nome da coluna é name, portanto, findByName
     * @param name nome da coluna
     * @return um Objeto Users preenchido
     */
    Users findByName(String name);

    @Query(value = "select u from Users u where u.name = :name and u.email = :email")
    Users findByNameAndEmail(String name, String email);

}
