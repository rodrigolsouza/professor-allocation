package com.project.professor.allocation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.professor.allocation.model.Course;
import com.project.professor.allocation.repositoy.CourseRepository;

@Service
public class CourseService {

	private CourseRepository courseRepository;

	public CourseService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	public List<Course> findAll() {
		return courseRepository.findAll();
	}
}
