package ru.yunovozhilov;

public abstract class Shape {
    public static final String DEFAULT_COLOR = "Black";

    private String color;
    public void draw() {
        System.out.println("Draw shape");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
