package com.learnspringboot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnspringboot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
