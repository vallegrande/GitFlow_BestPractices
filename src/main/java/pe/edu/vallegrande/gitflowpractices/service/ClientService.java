package pe.edu.vallegrande.gitflowpractices.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.gitflowpractices.model.Client;
import pe.edu.vallegrande.gitflowpractices.repository.ClientRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService {

    private ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

}
