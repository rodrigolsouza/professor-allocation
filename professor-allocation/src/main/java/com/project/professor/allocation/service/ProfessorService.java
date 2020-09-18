package com.project.professor.allocation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.professor.allocation.model.Professor;
import com.project.professor.allocation.repositoy.ProfessorRepository;

@Service
public class ProfessorService {

	private ProfessorRepository professorRepository;

	public ProfessorService(ProfessorRepository professorRepository) {
		this.professorRepository = professorRepository;
	}

	public List<Professor> findAll() {
		return professorRepository.findAll();
	}
}
