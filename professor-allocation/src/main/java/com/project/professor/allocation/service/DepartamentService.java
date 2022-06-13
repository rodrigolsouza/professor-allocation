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

	public Departament findById(Long id) {
		return departamentRepository.findById(id).orElse(null);
	}

	public Departament save(Departament departament) {
		departament.setId(null);
		return internalSave(departament);
	}
	
	
	
	
	public Departament internalSave(Departament departament) {
		try {
			return departamentRepository.save(departament);
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
