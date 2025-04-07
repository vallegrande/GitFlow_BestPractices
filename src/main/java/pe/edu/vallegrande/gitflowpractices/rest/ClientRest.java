package pe.edu.vallegrande.gitflowpractices.rest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.gitflowpractices.model.Client;
import pe.edu.vallegrande.gitflowpractices.service.ClientService;

import java.util.List;

@RequestMapping("/api/client")
@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class ClientRest {
    private ClientService clientService;


}
