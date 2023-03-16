package ru.yunovozhilov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseService")
public class SpringJpaCourseService implements CourseService{
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> findByTitle(String title) {
        return courseRepository.findByTitle("%"+title.trim()+"%");
    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }
}
