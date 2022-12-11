package com.ahmed.rockets.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Rocket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRocket;
    private String name;
    private String constructor;
    private int lowOrbitPayload;
    private int highOrbitPayload;
    private Date launchDate;
    private int nbLaunches;
    private int fails;

    public Rocket() {
        super();
    }

    public Rocket(String name, String constructor, int lowOrbitPayload, int highOrbitPayload, Date launchDate, int nbLaunches, int fails) {
        this.name = name;
        this.constructor = constructor;
        this.lowOrbitPayload = lowOrbitPayload;
        this.highOrbitPayload = highOrbitPayload;
        this.launchDate = launchDate;
        this.nbLaunches = nbLaunches;
        this.fails = fails;
    }

    public Long getIdRocket() {
        return idRocket;
    }

    public void setIdRocket(Long idRocket) {
        this.idRocket = idRocket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public int getLowOrbitPayload() {
        return lowOrbitPayload;
    }

    public void setLowOrbitPayload(int lowOrbitPayload) {
        this.lowOrbitPayload = lowOrbitPayload;
    }

    public int getHighOrbitPayload() {
        return highOrbitPayload;
    }

    public void setHighOrbitPayload(int highOrbitPayload) {
        this.highOrbitPayload = highOrbitPayload;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public int getNbLaunches() {
        return nbLaunches;
    }

    public void setNbLaunches(int nbLaunches) {
        this.nbLaunches = nbLaunches;
    }

    public int getFails() {
        return fails;
    }

    public void setFails(int fails) {
        this.fails = fails;
    }

@Override
    public String toString() {
        return "Rocket{" +
                "idRocket=" + idRocket +
                ", name='" + name + '\'' +
                ", constructor='" + constructor + '\'' +
                ", lowOrbitPayload=" + lowOrbitPayload +
                ", highOrbitPayload=" + highOrbitPayload +
                ", launchDate=" + launchDate +
                ", nbLaunches=" + nbLaunches +
                ", fails=" + fails +
                '}';
    }
}
