package com.example.Transportation.Controllers;

import com.example.Transportation.Models.Transportation;
import com.example.Transportation.Services.TransportationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/transportation")
public class TransportationController {
    @Autowired
    private TransportationService transportationService;

    @PostMapping
    public ResponseEntity<?> saveTransportation(@RequestBody Transportation transportation){
        return transportationService.saveTransportation(transportation);
    }

    @GetMapping
    public ResponseEntity<?> getAllTransportation(){
        return transportationService.getAllTransportations();
    }
}
