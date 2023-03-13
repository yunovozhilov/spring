package ru.yunovozhilov;

public abstract class Shape {
    private String color;
    public void drow() {
        System.out.println("Drow shape");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
