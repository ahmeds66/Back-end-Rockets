package com.ahmed.rockets.service;

import com.ahmed.rockets.entity.Rocket;
import com.ahmed.rockets.repos.RocketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RocketServiceImpl implements RocketService {
@Autowired
    private RocketRepository rocketRepository;

    @Override
    public Rocket saveRocket(Rocket rocket) {
        return rocketRepository.save(rocket);
    }

    @Override
    public Rocket updateRocket(Rocket rocket) {
        return rocketRepository.save(rocket);
    }



    @Override
    public void deleteRocket(Long id) {
        rocketRepository.deleteById(id);
    }

    @Override
    public Rocket getRocket(Long id) {
        return rocketRepository.findById(id).get();
    }

    @Override
    public List<Rocket> getAllRockets() {
        return rocketRepository.findAll();
    }

    @Override
    public List<Rocket> findByName(String name) {
        return rocketRepository.findByName(name);
    }

    @Override
    public List<Rocket> findByConstructor(String constructor) {
        return rocketRepository.findByConstructor(constructor);
    }

    @Override
    public List<Rocket> findByNameContaining(String name) {
        return rocketRepository.findByNameContaining(name);
    }
}

