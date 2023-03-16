package ru.yunovozhilov;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,Integer> {
    List<Course> findAll();

    @Query("select c from Course c where lower(c.title) LIKE lower(:title)") // JPQL
    List<Course> findByTitle(@Param("title") String title);
}
