package com.tenant.manager.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.tenant.manager.model.Branch;
import com.tenant.manager.model.Tenant;

@Transactional
@Repository
public class TenantDaoImpl implements TenantDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Tenant> getAllTenants() {
		String hql = "FROM Tenant";
		return (List<Tenant>)entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Tenant getTenant(int id) {
		String hql = "From Tenant where mobile = '"+id+"'";
//		return entityManager.find(Tenant.class, id);
		return (Tenant) entityManager.createQuery(hql).getSingleResult();
	}

	@Override
	public void updateTenant(Tenant updatedTenant) {
		Tenant tenant = getTenant(updatedTenant.getId());
		tenant.setAddress(updatedTenant.getAddress());
		tenant.setAmount(updatedTenant.getAmount());
		tenant.setbId(updatedTenant.getbId());
		tenant.setDoj(updatedTenant.getDoj());
		tenant.setEmail(updatedTenant.getEmail());
		tenant.setMobile(updatedTenant.getMobile());
		tenant.setName(updatedTenant.getName());
		tenant.setRoom(updatedTenant.getRoom());
		entityManager.flush();
		
	}

	@Override
	public List<Branch> getBranches(String hid) {
		return (List<Branch>) entityManager.createQuery("from Branch where hid='" + hid +"'").getResultList();
	}

}
