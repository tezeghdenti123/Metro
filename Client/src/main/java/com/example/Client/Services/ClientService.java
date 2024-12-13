package com.example.Client.Services;

import com.example.Client.Models.Client;
import com.example.Client.Repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {
    @Autowired
    private final ClientRepository clientRepository;

    public ResponseEntity<?> saveClient(Client client){
        if(client.getEmail()==null || client.getPassword()==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email or password should Not be Null!");
        }
        else if(clientRepository.existsByEmail(client.getEmail())){
             return ResponseEntity.status(HttpStatus.CONFLICT).body("Email is already in use");
        }
        clientRepository.save(client);
        return ResponseEntity.status(HttpStatus.CREATED).body("Client created successfully!");
    }

    public ResponseEntity<List<Client>> getAllClients(){
        return ResponseEntity.ok(clientRepository.findAll());
    }
}
