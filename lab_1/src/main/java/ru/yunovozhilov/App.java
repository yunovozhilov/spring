package ru.yunovozhilov;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("appConfig.xml");

        Point point = ctx.getBean("point", Point.class);
        point.drow();

        Circle circle = ctx.getBean("circle", Circle.class);
        circle.drow();
    }
}
