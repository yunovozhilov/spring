package ru.yunovozhilov;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Circle extends Shape{
    private Coords center;
    private int radius;

    @Override
    public void drow() {
        System.out.printf("Drow circle with center %s, radius %s and color %s\n", getCenter(), getRadius(), getColor());
    }

    public Circle(@Value("#{coords}") Coords center, @Value("10") int radius) {
        this.center = center;
        this.radius = radius;
        this.setColor("Pink");
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

    public void setX(int x) {
        getCenter().setX(x);
    }

    public int getY() {
        return getCenter().getY();
    }

    public void setY(int y) {
        getCenter().setY(y);
    }

    @Override
//    @Value("Red")
    public void setColor(String color) {
        super.setColor(color);
    }
}
