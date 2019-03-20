package com.tenant.manager.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.tenant.manager.model.Person;

@Transactional
@Repository
public class TenantDaoImpl implements TenantDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Person> getAllTenants() {
		String hql = "FROM Person";
		return (List<Person>)entityManager.createQuery(hql).getResultList();
	}

}
