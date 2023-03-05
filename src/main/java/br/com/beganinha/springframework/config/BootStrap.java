package br.com.beganinha.springframework.config;

import br.com.beganinha.springframework.entity.Users;
import br.com.beganinha.springframework.repository.UsersRepositoryMongodb;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class BootStrap implements ApplicationListener<ContextRefreshedEvent> {

//    @Autowired
//    private UsersRepositoryMySql usersRepository;

    @Autowired
    private UsersRepositoryMongodb usersRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        List<Users> users = usersRepository.findAll();
        if(users.isEmpty()) {

            createUser("Afonso", "alcantara.afonso@gmail.com");
            createUser("Afonsinho", "alcantara.afonsinho@gmail.com");
            createUser("Maria", "alcantara.maria@gmail.com");

        }

        Users user = usersRepository.findById("6404dcdebc539f38a58ca079").get();
        log.info(user.toString());

        Users users1 = usersRepository.findByEmailQualquerCoisa("alcantara.afonso@gmail.com");
        log.info(users1.toString());

    }

    private void createUser(String name, String email) {
        Users user = new Users(null, name, email, null);
        usersRepository.save(user);
    }
}
