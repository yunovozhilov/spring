package ru.yunovozhilov;

import java.util.List;

public class Scene {
    List<Shape> objects;

    public List<Shape> getObjects() {
        return objects;
    }

    public void setObjects(List<Shape> objects) {
        this.objects = objects;
    }

    public void draw() {
        System.out.println("Draw objects of scene:");
        for(Shape s : objects)
            s.draw();
    }
}
