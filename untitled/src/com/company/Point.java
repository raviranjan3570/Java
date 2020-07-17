package com.company;

public class Point {

    public Point(){

        this(0,0);
    }

    public Point(int x, int y){

        this.x = x;
        this.y = y;
    }

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){

        return distance(0,0);
    }

    public double distance(Point another){

        return distance(another.x, another.y);
    }

    public double distance(int x, int y){

        double distance;
        double horizontalDistance;
        double verticalDistance;

        horizontalDistance = Math.pow((this.x - x), 2);
        verticalDistance = Math.pow((this.y - y), 2);

        distance = Math.sqrt(horizontalDistance + verticalDistance);
        return distance;
    }
}
