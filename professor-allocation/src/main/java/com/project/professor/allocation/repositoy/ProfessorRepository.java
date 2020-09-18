package com.project.professor.allocation.repositoy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professor.allocation.model.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

	List<Professor> findByNameContainingIgnoreCase(String name);
}
