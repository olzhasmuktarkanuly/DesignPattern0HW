package edu.narxoz.galactic.config;

import edu.narxoz.galactic.drones.Drone;
import edu.narxoz.galactic.drones.HeavyDrone;
import edu.narxoz.galactic.drones.LightDrone;

public class MilitaryDroneFactory implements DroneConfigFactory{
    @Override
    public Drone createDrone(String id) {
        return new HeavyDrone(id ,50);
    }
}
