package edu.narxoz.galactic.config;

import edu.narxoz.galactic.drones.Drone;
import edu.narxoz.galactic.drones.LightDrone;

public class CivilianDroneFactory implements DroneConfigFactory{

    @Override
    public Drone createDrone(String id) {
        return new LightDrone(id,20);
    }
}
