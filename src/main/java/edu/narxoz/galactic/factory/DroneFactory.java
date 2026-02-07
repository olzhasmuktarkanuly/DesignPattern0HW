package edu.narxoz.galactic.factory;

import edu.narxoz.galactic.*;
import edu.narxoz.galactic.drones.Drone;
import edu.narxoz.galactic.drones.HeavyDrone;
import edu.narxoz.galactic.drones.LightDrone;


public class DroneFactory {

    public static Drone createDrone(String type, String id, double maxPauLoadkg) {
        if (type == null) {
            throw new IllegalArgumentException("Drone cannot be null");
        }

        return switch (type.toLowerCase()){
            case "light" -> new LightDrone(id,maxPauLoadkg);
            case "heavy" -> new HeavyDrone(id,maxPauLoadkg);
            default -> throw new IllegalArgumentException("Unknown drone type");
        };

    }


}