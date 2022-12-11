package com.ahmed.rockets;

import com.ahmed.rockets.entity.Rocket;
import com.ahmed.rockets.repos.RocketRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class RocketsApplicationTests {
    @Autowired
    private RocketRepository rocketRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testFindRocket() {
        Rocket rocket = rocketRepository.findById(1L).get();
        System.out.println(rocket);
    }

    @Test
    public void testUpdateRocket() {
        Rocket rocket = rocketRepository.findById(1L).get();
        rocket.setFails(rocket.getFails() + 1);
        rocketRepository.save(rocket);
    }

    @Test
    public void testDeleteRocket() {
        rocketRepository.deleteById(1L);
    }

    @Test
    public void testListAllRockets() {
        List<Rocket> rockets = rocketRepository.findAll();
        for (Rocket rocket : rockets) {
            System.out.println(rocket);
        }
    }

    @Test
    public void testFindRocketByName() {
        List<Rocket> rockets = rocketRepository.findByName("Falcon 9");
        for (Rocket rocket : rockets) {
            System.out.println(rocket);
        }
    }

    @Test
    public void testFindRocketByConstructor() {
        List<Rocket> rockets = rocketRepository.findByConstructor("SpaceX");
        for (Rocket rocket : rockets) {
            System.out.println(rocket);
        }
    }

    @Test
    public void testFindRocketByNameContaining() {
        List<Rocket> rockets = rocketRepository.findByNameContaining("Falcon");
        for (Rocket rocket : rockets) {
            System.out.println(rocket);
        }
    }

}
