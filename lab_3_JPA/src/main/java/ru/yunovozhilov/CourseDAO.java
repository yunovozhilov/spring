package ru.yunovozhilov;

import java.util.List;

public interface CourseDAO {

    Course findById(int id);
    List<Course> findAll();

    List<Course> findByTitle(String title);
    List<Course> findByTitleIgnoreCase(String title);
    void insert(Course course);
    void update(Course course);
    void delete(int id);

}
