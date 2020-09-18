package com.project.professor.allocation.model;

import java.time.DayOfWeek;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "allocation")
public class Allocation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(name = "dayOfWeek", nullable = false)
	private DayOfWeek dayOfWeek;

	@Column(name = "startHour", nullable = false)
	private Integer startHour;

	@Column(name = "endHour", nullable = false)
	private Integer endHour;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	private Professor professor;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	private Course course;

	public Allocation() {
	}

}
