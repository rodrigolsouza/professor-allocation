package com.project.professor.allocation.repositoy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professor.allocation.model.Allocation;
import com.project.professor.allocation.model.Course;
import com.project.professor.allocation.model.Professor;

@Repository
public interface AllocationRepository extends JpaRepository<Allocation, Long> {

	List<Allocation> findByProfessor(Professor professor);
	List<Allocation> findByCourse(Course course);
}
