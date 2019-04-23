package com.tenant.manager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tenant.manager.dao.TenantRepository;
import com.tenant.manager.dto.TenantDto;
import com.tenant.manager.model.Tenant;
import com.tenant.manager.utils.TenantUtils;

@Service
public class TenantJpaService implements TenantService{

	@Autowired
	private TenantRepository tenantRepository;
	
	@Override
	public List<TenantDto> getAllTenants() {
		
		return TenantUtils.toConvertDtoList(tenantRepository.findAll());
	}

	@Override
	public TenantDto getTenant(int id) {
		Optional<Tenant> tenant = tenantRepository.findById(id);
		if(!tenant.isPresent()) {
			throw new RuntimeException("Tenant with " + id + " is not available" );
		}
		return TenantUtils.toTenantDto(tenant.get());
	}

	@Override
	public void updateTenant(TenantDto tenant) {
		tenantRepository.save(TenantUtils.toTenantEntity(tenant));
	}

	@Override
	public void addTenant(TenantDto newTenant) {
		tenantRepository.save(TenantUtils.toTenantEntity(newTenant));
	}

	@Override
	public void deleteTenant(int id) {
		tenantRepository.deleteById(id);
	}

	@Override
	public List<TenantDto> searchTenants(String keyWord, String hID) {
		return TenantUtils.toConvertDtoList(tenantRepository.searchBy(keyWord, hID));
	}
	
	

}
