package ru.yunovozhilov;

import org.springframework.beans.factory.annotation.Value;

public class Point extends Shape{
    private Coords coords;

    @Override
    public void draw() {
        System.out.printf("Draw point with coords %s and color %s\n", getCoords(), getColor());
    }

    public Point(Coords coords) {
        this.coords = coords;
    }

//    public Point() { }

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    public int getX() {
        return getCoords().getX();
    }

    @Value("50")
    public void setX(int x) {
        getCoords().setX(x);
    }

    public int getY() {
        return getCoords().getY();
    }

    @Value("50")
    public void setY(int y) {
        getCoords().setY(y);
    }
}
