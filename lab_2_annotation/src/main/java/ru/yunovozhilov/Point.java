package ru.yunovozhilov;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Point extends Shape{
    private Coords coords;

    @Override
    public void drow() {
        System.out.printf("Drow point with coords %s and color %s\n", getCoords(), getColor());
    }

    public Point(@Value("#{coords}") Coords coords) {
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
