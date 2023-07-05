package com.learn.DesignPatterns.Behavioural.Mediator;

public class Main {
    public static void main(String[] args) {
        ControlTowerMediator towerMediator = new ControlTowerMediator();
        Colleague plane = new Plane(towerMediator);
        Colleague groundStaff = new GroundStaff(towerMediator);

        towerMediator.addColleague(plane);
        towerMediator.addColleague(groundStaff);

        plane.send("Hello from plane");
        System.out.println();
        groundStaff.send("Hello from ground staff");
    }
}
