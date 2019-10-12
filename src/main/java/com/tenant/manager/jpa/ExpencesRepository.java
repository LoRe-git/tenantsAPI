package com.tenant.manager.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tenant.manager.model.Expences;

public interface ExpencesRepository extends CrudRepository<Expences, Integer>{
	public List<Expences> findByChecklistid(Integer checklistId);
}
