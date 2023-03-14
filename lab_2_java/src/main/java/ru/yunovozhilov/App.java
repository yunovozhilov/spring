package ru.yunovozhilov;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        try (AnnotationConfigApplicationContext gContext =
                     new AnnotationConfigApplicationContext(BuilderConfig.class))
        {
            System.out.printf("Add point %s to scene\n",gContext.getBean(Point.class).getCoords());
            System.out.printf("Add circle %s to scene\n",gContext.getBean(Circle.class).getCenter());
            gContext.getBean(Scene.class).draw();
        }
    }
}
