package edu.narxoz.galactic;

import edu.narxoz.galactic.bodies.Planet;
import edu.narxoz.galactic.bodies.SpaceStation;
import edu.narxoz.galactic.cargo.Cargo;
import edu.narxoz.galactic.config.MilitaryDroneFactory;
import edu.narxoz.galactic.drones.LightDrone;
import edu.narxoz.galactic.drones.HeavyDrone;
import edu.narxoz.galactic.drones.Drone;
import edu.narxoz.galactic.task.DeliveryTask;
import edu.narxoz.galactic.dispatcher.Dispatcher;
import edu.narxoz.galactic.dispatcher.Result;
import edu.narxoz.galactic.factory.DroneFactory;

public class Main {
    public static void main(String[] args) {
//        Dispatcher dispatcher = new Dispatcher();
//
//        Planet earth = new Planet("Earth", 0, 0, "Nitrogen-Oxygen");
//        SpaceStation station = new SpaceStation("AlphaStation", 100, 100, 1);
//
//        Cargo lightCargo = new Cargo(5, "Light Package");
//        Cargo heavyCargo = new Cargo(20, "Heavy Package");
//
//        Drone lightDrone = new LightDrone("L-001", 10);
//        Drone heavyDrone = new HeavyDrone("H-001", 50);
//
//
//        DeliveryTask task1 = new DeliveryTask(earth, station, heavyCargo);
//        Result result1 = dispatcher.assignTask(task1, lightDrone);
//        System.out.println("Assign LightDrone heavy cargo: " + result1.ok() + " - " + result1.reason());
//
//        DeliveryTask task2 = new DeliveryTask(earth, station, heavyCargo);
//        Result result2 = dispatcher.assignTask(task2, heavyDrone);
//        System.out.println("Assign HeavyDrone heavy cargo: " + result2.ok() + " - " + result2.reason());
//
//        double time = task2.estimateTime();
//        System.out.println("Estimated delivery time: " + time + " min");
//
//        Result resultComplete = dispatcher.completeTask(task2);
//        System.out.println("Complete task: " + resultComplete.ok() + " - " + resultComplete.reason());
//
//        System.out.println("HeavyDrone status: " + heavyDrone.getStatus());
//        System.out.println("Task2 state: " + task2.getState());






        Dispatcher dispatcher2 = new Dispatcher();

        Planet mars = new Planet("mars", 3, 2, "Poison");
        SpaceStation station2 = new SpaceStation("BetaStation", 100, 100, 1);

        Planet saturn = new Planet("saturn", 9, 6, "Pollution");
        SpaceStation station3 = new SpaceStation("TetraStation", 112, 99, 1);

        Cargo civilian1cargo = new Cargo(10, "Light Package");
        Cargo military1cargo = new Cargo(30, "Heavy Package");

        Drone civilian= DroneFactory.createDrone("LIGHT", "L-002", 10);
        Drone military = DroneFactory.createDrone("HEAVY", "H-002", 50);

        DeliveryTask task3 = new DeliveryTask(mars, station2, civilian1cargo);
        Result result3 = dispatcher2.assignTask(task3, civilian);
        System.out.println("Assign LightDrone heavy cargo: " + result3.ok() + " - " + result3.reason());

        DeliveryTask task4 = new DeliveryTask(saturn, station3, military1cargo);
        Result result4 = dispatcher2.assignTask(task4, military);
        System.out.println("Assign HeavyDrone heavy cargo: " + result4.ok() + " - " + result4.reason());

        double time3 = task3.estimateTime();
        System.out.println("Estimated delivery time: " + time3 + " min");

        Result resultComplete2 = dispatcher2.completeTask(task3);
        System.out.println("Complete task: " + resultComplete2.ok() + " - " + resultComplete2.reason());


        double time4 = task4.estimateTime();
        System.out.println("Estimated delivery time: " + time4 + " min");

        Result resultComplete4 = dispatcher2.completeTask(task4);
        System.out.println("Complete task: " + resultComplete4.ok() + " - " + resultComplete4.reason());
}
}
