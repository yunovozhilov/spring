package ru.yunovozhilov;

import org.springframework.beans.factory.annotation.Value;

public abstract class Shape {
    private String color;
    public void drow() {
        System.out.println("Drow shape");
    }

    public String getColor() {
        return color;
    }

    @Value("Black")
    public void setColor(String color) {
        this.color = color;
    }
}
