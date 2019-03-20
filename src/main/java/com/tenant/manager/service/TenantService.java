package com.tenant.manager.service;

import java.util.List;

import com.tenant.manager.model.Person;

public interface TenantService {
	List<Person> getAllTenants();
}
