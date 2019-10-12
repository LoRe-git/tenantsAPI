package com.tenant.manager.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tenant.manager.model.Checklist;

@Repository
public interface CheckListRepository extends CrudRepository<Checklist, Integer>{
	List<Checklist> findByBid(String bid);
}
