package ru.yunovozhilov;

import org.springframework.beans.factory.annotation.Value;

public class Circle extends Shape{
    private Coords center;
    private int radius;

    @Override
    public void draw() {
        System.out.printf("Draw circle with center %s, radius %s and color %s\n", getCenter(), getRadius(), getColor());
    }

    public Circle(Coords center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Coords getCenter() {
        return center;
    }

//    public Circle() { }

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

    @Value("#{T(java.lang.Math).random()*100}")
    public void setX(int x) {
        getCenter().setX(x);
    }

    public int getY() {
        return getCenter().getY();
    }

    @Value("#{T(java.lang.Math).random()*100}")
    public void setY(int y) {
        getCenter().setY(y);
    }
}
