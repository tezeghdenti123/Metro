package com.example.Transportation.Services;

import com.example.Transportation.Models.Transportation;
import com.example.Transportation.Repositories.TransportationRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransportationService {
    @Autowired
    private TransportationRepository transportationRepository;

    public ResponseEntity<?> saveTransportation(Transportation transportation){
        transportationRepository.save(transportation);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
    public ResponseEntity<?> getAllTransportations(){
        return ResponseEntity.ok(transportationRepository.findAll());
    }
}
