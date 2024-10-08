package ma.emsi.clientservice;

import ma.emsi.clientservice.entities.Client;
import ma.emsi.clientservice.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientServiceApplication implements CommandLineRunner {

    @Autowired
    ClientRepository clientRepository;
    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        clientRepository.save(new Client(null,"Ahmed","ahmed@gmail.com"));
        clientRepository.save(new Client(null,"Salma","salma@gmail.com"));
        clientRepository.save(new Client(null,"Karim","karim@gmail.com"));
    }
}
