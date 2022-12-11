package com.ahmed.rockets.restcontrollers;

import com.ahmed.rockets.entity.Rocket;
import com.ahmed.rockets.service.RocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class RocketRESTController {
    @Autowired
    RocketService rocketService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Rocket> getAllRockets() {
        return rocketService.getAllRockets();
    }

    @RequestMapping(value ="/{id}",method = RequestMethod.GET)
        public Rocket getRocketById(@PathVariable("id") Long id){
            return rocketService.getRocket(id);
    }

    @RequestMapping(method = RequestMethod.POST)
        public Rocket createRocket(@RequestBody Rocket rocket){
            return rocketService.saveRocket(rocket);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Rocket updateRocket(@RequestBody Rocket rocket){
        return rocketService.updateRocket(rocket);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
        public void deleteRocket(@PathVariable("id") Long id){
            rocketService.deleteRocket(id);
    }

    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
        public List<Rocket> getRocketByName(@PathVariable("name") String name){
            return rocketService.findByName(name);
    }


}
