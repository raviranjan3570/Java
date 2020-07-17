package com.company;

public class Lamp {

    private String styles;
    private boolean battery;
    private int globRating;

    public Lamp(String styles, boolean battery, int globRating) {
        this.styles = styles;
        this.battery = battery;
        this.globRating = globRating;
    }

    public String getStyles() {
        return styles;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public void turnOn(){
        System.out.println("Wall -> turning On");
    }
}
