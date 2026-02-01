package edu.narxoz.galactic;

import edu.narxoz.galactic.bodies.Planet;
import edu.narxoz.galactic.bodies.SpaceStation;
import edu.narxoz.galactic.cargo.Cargo;
import edu.narxoz.galactic.drones.LightDrone;
import edu.narxoz.galactic.drones.HeavyDrone;
import edu.narxoz.galactic.drones.Drone;
import edu.narxoz.galactic.task.DeliveryTask;
import edu.narxoz.galactic.dispatcher.Dispatcher;
import edu.narxoz.galactic.dispatcher.Result;

public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();

        Planet earth = new Planet("Earth", 0, 0, "Nitrogen-Oxygen");
        SpaceStation station = new SpaceStation("AlphaStation", 100, 100, 1);

        Cargo lightCargo = new Cargo(5, "Light Package");
        Cargo heavyCargo = new Cargo(20, "Heavy Package");

        Drone lightDrone = new LightDrone("L-001", 10);
        Drone heavyDrone = new HeavyDrone("H-001", 50);


        DeliveryTask task1 = new DeliveryTask(earth, station, heavyCargo);
        Result result1 = dispatcher.assignTask(task1, lightDrone);
        System.out.println("Assign LightDrone heavy cargo: " + result1.ok() + " - " + result1.reason());


        DeliveryTask task2 = new DeliveryTask(earth, station, heavyCargo);
        Result result2 = dispatcher.assignTask(task2, heavyDrone);
        System.out.println("Assign HeavyDrone heavy cargo: " + result2.ok() + " - " + result2.reason());


        double time = task2.estimateTime();
        System.out.println("Estimated delivery time: " + time + " min");


        Result resultComplete = dispatcher.completeTask(task2);
        System.out.println("Complete task: " + resultComplete.ok() + " - " + resultComplete.reason());


        System.out.println("HeavyDrone status: " + heavyDrone.getStatus());
        System.out.println("Task2 state: " + task2.getState());
    }
}
