package ru.yunovozhilov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appContext.xml");
        CourseService courseService = context.getBean("courseService",
                CourseService.class);
        for(Course c : courseService.findByTitle("web"))
            System.out.println(c);
        System.out.println("------------------------------------------");
        for(Course c : courseService.findAll())
            System.out.println(c);

        context.close();
    }
}
