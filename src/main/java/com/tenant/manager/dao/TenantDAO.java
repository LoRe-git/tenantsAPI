package com.tenant.manager.dao;

import java.util.List;

import com.tenant.manager.model.Person;

public interface TenantDAO {
	List<Person> getAllTenants();
}
