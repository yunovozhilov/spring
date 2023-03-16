package ru.yunovozhilov;

import java.util.List;

public interface CourseService {
    List<Course> findByTitle(String title);
    List<Course> findAll();
}
