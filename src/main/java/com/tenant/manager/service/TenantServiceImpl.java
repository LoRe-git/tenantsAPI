package com.tenant.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tenant.manager.dao.TenantDAO;
import com.tenant.manager.model.Person;

@Service
public class TenantServiceImpl implements TenantService{

	@Autowired
	private TenantDAO tenantDAO;
	
	@Override
	public List<Person> getAllTenants() {
		return tenantDAO.getAllTenants();
	}

}
