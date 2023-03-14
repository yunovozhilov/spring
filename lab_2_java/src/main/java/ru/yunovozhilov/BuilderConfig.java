package ru.yunovozhilov;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import ru.yunovozhilov.*;

import java.util.ArrayList;

@Configuration
public class BuilderConfig {

    @Bean
    @Scope("prototype")
    @Lazy
    public Coords coords() {
        return new Coords();
    }

    @Bean
    @Scope("prototype")
    @Lazy
    public Point point() {
        Point point = new Point(coords());
        point.setColor(Shape.DEFAULT_COLOR);
        scene().getObjects().add(point);
        return point;
    }

    @Bean
    @Scope("prototype")
    @Lazy
    public Circle circle() {
        Circle circle = new Circle(coords(),10);
        circle.setColor("Red");
        circle.setRadius(10);
        scene().getObjects().add(circle);
        return circle;
    }

    @Bean
    @Scope("singleton")
    public Scene scene() {
        Scene scene = new Scene();
        scene.setObjects(new ArrayList<Shape>());
//        scene.getObjects().add(point());
//        scene.getObjects().add(circle());
        return scene;
    }
}
