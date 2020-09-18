package com.project.professor.allocation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.professor.allocation.model.Departament;
import com.project.professor.allocation.repositoy.DepartamentRepository;

@Service
public class DepartamentService {

	private DepartamentRepository departamentRepository;

	public DepartamentService(DepartamentRepository departamentRepository) {
		this.departamentRepository = departamentRepository;

	}

	public List<Departament> findAll(String name) {
		return departamentRepository.findAll();
	}

}
