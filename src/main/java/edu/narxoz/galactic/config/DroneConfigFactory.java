package edu.narxoz.galactic.config;

import edu.narxoz.galactic.drones.Drone;

public interface DroneConfigFactory {
    Drone createDrone(String id);
}
