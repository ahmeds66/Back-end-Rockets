package com.ahmed.rockets.service;

import com.ahmed.rockets.entity.Rocket;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RocketService {
    Rocket saveRocket(Rocket rocket);
    Rocket updateRocket(Rocket rocket);
    void deleteRocket(Long id);
    Rocket getRocket(Long id);
    List<Rocket> getAllRockets();
    List<Rocket> findByName(String name);
    List<Rocket> findByConstructor(String constructor);
    List<Rocket> findByNameContaining(String name);

}
