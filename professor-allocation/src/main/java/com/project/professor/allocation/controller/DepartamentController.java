package com.project.professor.allocation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.professor.allocation.model.Departament;
import com.project.professor.allocation.service.DepartamentService;

@RestController
@RequestMapping(path = "/departament", produces = MediaType.APPLICATION_JSON_VALUE)
public class DepartamentController {

	private DepartamentService departamentService;

	public DepartamentController(DepartamentService departamentService) {
		this.departamentService = departamentService;
	}

	@GetMapping
	public ResponseEntity<List<Departament>> getDepartaments(@RequestParam Optional<String> name) {
		List<Departament> departaments = departamentService.findAll(name.orElse(null));
		return new ResponseEntity<>(departaments, HttpStatus.OK);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Departament> getDepartament(@PathVariable(value = "id") Long id) {
		Departament departament = departamentService.findById(id);
		if (departament == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(departament, HttpStatus.OK);
		}
	}
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Departament> createDepartament(@RequestBody Departament departament){
		Departament departamentSaved= departamentService.save(departament);
		if (departamentSaved==null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<>(departamentSaved,HttpStatus.CREATED);
		}
	}

}
