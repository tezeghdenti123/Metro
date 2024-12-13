package com.example.Client.Controllers;

import com.example.Client.Models.Client;
import com.example.Client.Services.ClientService;
import jakarta.ws.rs.GET;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/client")
@RequiredArgsConstructor
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<?> saveClient(@RequestBody Client client){
        return clientService.saveClient(client);
    }

    @GetMapping
    public ResponseEntity<?> getAllClients(){
        return clientService.getAllClients();
    }
}
