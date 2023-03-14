package ru.yunovozhilov;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Coords {
    int x;
    int y;

    public int getX() {
        return x;
    }

    @Value("#{T(java.lang.Math).random()*100}")
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    @Value("#{T(java.lang.Math).random()*100}")
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
