package com.tenant.manager.service;

import java.util.List;

import com.tenant.manager.dto.BranchDto;
import com.tenant.manager.dto.RoomDto;
import com.tenant.manager.dto.TenantDto;

public interface TenantService {
	List<TenantDto> getAllTenants();
	TenantDto getTenant(int id);
	void updateTenant(TenantDto tenant);
	void addTenant(TenantDto newTenant);
	void deleteTenant(int id);
	List<TenantDto> searchTenants(String keyWord, String hID);
	List<BranchDto> getBranches(String hid);
	List<RoomDto> getRoomsByBranch(String bid);
}
