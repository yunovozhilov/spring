package ru.yunovozhilov;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan("ru.yunovozhilov")
public class App {
    public static void main( String[] args ) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);

        Point point = ctx.getBean("point", Point.class);
        point.drow();

        Circle circle = ctx.getBean("circle", Circle.class);
        circle.drow();
    }
}
