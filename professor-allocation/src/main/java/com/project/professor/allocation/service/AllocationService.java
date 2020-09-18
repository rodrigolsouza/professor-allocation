package com.project.professor.allocation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.professor.allocation.model.Allocation;
import com.project.professor.allocation.repositoy.AllocationRepository;

@Service
public class AllocationService {

	private AllocationRepository allocationRepository;

	public AllocationService(AllocationRepository allocationRepository) {
		this.allocationRepository = allocationRepository;
	}

	public List<Allocation> findAll() {
		return allocationRepository.findAll();
	}

}
