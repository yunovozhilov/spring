package ru.yunovozhilov;

public class Circle extends Shape{
    private Coords center;
    private int radius;

    @Override
    public void drow() {
        System.out.printf("Drow circle with center %s and radius %s\n", getCenter(), getRadius());
    }

    public Circle(Coords center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Coords getCenter() {
        return center;
    }

    public Circle() { }

    public void setCenter(Coords center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return getCenter().getX();
    }

    public void setX(int x) {
        getCenter().setX(x);
    }

    public int getY() {
        return getCenter().getY();
    }

    public void setY(int y) {
        getCenter().setY(y);
    }
}
