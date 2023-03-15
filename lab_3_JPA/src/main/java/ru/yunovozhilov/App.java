package ru.yunovozhilov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appContext.xml");

        CourseDAO courseDao = context.getBean(CourseDAO.class);

        //Поиск в H2 регистрозависимый
        for(Course c : courseDao.findByTitle("Web"))
            System.out.println(c);

        System.out.println("------------------------------------");

        //реализация поиска без учета регистра
        for(Course c : courseDao.findByTitleIgnoreCase("web"))
            System.out.println(c);

        context.close();
    }
}
