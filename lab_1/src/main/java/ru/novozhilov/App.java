package ru.novozhilov;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("appConfig.xml");


}
