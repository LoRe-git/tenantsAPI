package com.tenant.manager.service;

import java.util.List;

import com.tenant.manager.dto.TenantDto;

public interface TenantService {
	List<TenantDto> getAllTenants();
	TenantDto getTenant(int id);
	void updateTenant(TenantDto tenant);
	void addTenant(TenantDto newTenant);
	void deleteTenant(int id);
}