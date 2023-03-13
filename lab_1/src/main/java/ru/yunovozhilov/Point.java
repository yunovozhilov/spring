package ru.yunovozhilov;

public class Point extends Shape{
    private Coords coords;

    @Override
    public void drow() {
        System.out.printf("Drow point with coords %s\n", getCoords());
    }

    public Point(Coords coords) {
        this.coords = coords;
    }

    public Point() { }

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    public int getX() {
        return getCoords().getX();
    }

    public void setX(int x) {
        getCoords().setX(x);
    }

    public int getY() {
        return getCoords().getY();
    }

    public void setY(int y) {
        getCoords().setY(y);
    }
}
