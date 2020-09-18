package com.project.professor.allocation.repositoy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professor.allocation.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

	List<Course> findByNameContainingIgnoreCase(String name);
}
