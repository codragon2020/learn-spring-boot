package com.learnspringboot.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learnspringboot.courses.bean.Course;
import com.learnspringboot.courses.repository.CourseRepository;

// RestController helps expose the Rest API
@RestController
public class CourseController {

	@Autowired
	private CourseRepository repository;

	// http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return repository.findAll();

		//		return List.of(new Course(1, "Learn Microservices 1", "Jason McGinthy"),
		//				new Course(2, "Learn Full Stack", "Jason McGinthy"));
	}

	@GetMapping("/courses/{id}")
	public Course getCourseDetails(@PathVariable int id) {
		Optional<Course> course = repository.findById(id);
		if (course.isEmpty()) {
			throw new RuntimeException("Course not found with id " + id);
		}

		return course.get();

	}

	// POST - create a new course /courses
	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course) {
		repository.save(course);
	}

	// PUT - update a course /courses
	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable int id, @RequestBody Course course) {
		repository.save(course);
	}

	// DELETE - delete a course /courses
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable int id, @RequestBody Course course) {
		repository.deleteById(id);
	}
}
