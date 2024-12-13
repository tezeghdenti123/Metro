package com.example.Transportation.Repositories;

import com.example.Transportation.Models.Transportation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportationRepository  extends JpaRepository<Transportation,Long> {
}
