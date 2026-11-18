package ma.project.microservices.voitureservice.services;

import ma.project.microservices.voitureservice.entities.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(value = "client-service", url = "http://localhost:8088")
public interface ClientService {

    @GetMapping("/client/{id}")
    Client getClientById(@PathVariable Long id);
}
