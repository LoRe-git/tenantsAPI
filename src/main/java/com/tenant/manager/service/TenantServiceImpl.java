package com.tenant.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tenant.manager.dao.TenantDAO;
import com.tenant.manager.dto.TenantDto;
import com.tenant.manager.utils.TenantUtils;

@Service
public class TenantServiceImpl implements TenantService {

	@Autowired
	private TenantDAO tenantDAO;

	@Override
	public List<TenantDto> getAllTenants() {
//		List<Tenant> tenantsEntities = tenantDAO.getAllTenants(); 
		return TenantUtils.toConvertDtoList(tenantDAO.getAllTenants());

	}

	@Override
	public TenantDto getTenant(int id) {
		return TenantUtils.toTenantDto(tenantDAO.getTenant(id));

	}


	@Override
	public void updateTenant(TenantDto tenant) {
		tenantDAO.updateTenant(TenantUtils.toTenantEntity(tenant));
	}

	@Override
	public void addTenant(TenantDto newTenant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTenant(int id) {
		// TODO Auto-generated method stub
		
	}
		
}
