package com.company;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");
        Ceiling ceiling = new Ceiling(12, 13);
        Bed bed = new Bed("Modern",2,10,1,1);
        Lamp lamp = new Lamp("Classic",true,75);
        Bedroom bedroom = new Bedroom("Ravi's",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
