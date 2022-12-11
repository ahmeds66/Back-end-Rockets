package com.ahmed.rockets.repos;

import com.ahmed.rockets.entity.Rocket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "rest")
public interface RocketRepository extends JpaRepository<Rocket, Long> {
    List<Rocket> findByName(String name);
    List<Rocket> findByConstructor(String constructor);
    List<Rocket> findByNameContaining(String name);
}

