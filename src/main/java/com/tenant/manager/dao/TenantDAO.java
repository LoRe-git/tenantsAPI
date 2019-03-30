package com.tenant.manager.dao;

import java.util.List;

import com.tenant.manager.model.Tenant;

public interface TenantDAO {
	List<Tenant> getAllTenants();

	void updateTenant(Tenant updatedTenant);

	Tenant getTenant(int id);
}
