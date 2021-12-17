package com.eduardopt.crudspring.controller;

import java.util.List;

import com.eduardopt.crudspring.model.Course;
import com.eduardopt.crudspring.repository.CourseRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/courses") // significa que essa classe contém um endpoint.
// Por trás dos panos é um JavaServlet, que possui os métodos CRUD.
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }
    
}
