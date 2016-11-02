package fr.uha.miage.project;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.uha.miage.project.model.User;
import fr.uha.miage.project.repository.UserRepository;




@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
    @Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			
			log.info("Adding an administrator and a user");
			User admin, u;
			admin = new User();
			admin.setAdmin(true);
			admin.setName("theBoss");
			admin.setPseudo("Admin");
			admin.setPassword("admin");
			admin.setMail("admin@mail.com");
			u = new User();
			u.setName("User");
			u.setAdmin(false);
			u.setPseudo("User");
			u.setPassword("user");
			u.setMail("user@mail.com");
			
			User savedAdmin= repository.save(admin);
			log.info("saved user ID : "+savedAdmin.getId()+"   with pseudo"+savedAdmin.getPseudo());
			User savedUser= repository.save(u);
			log.info("saved user ID : "+savedUser.getId()+"   with pseudo"+savedUser.getPseudo());
		};
	}

}
