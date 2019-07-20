package com.tenant.manager.utils;

import java.util.ArrayList;
import java.util.List;

import com.tenant.manager.dto.BranchDto;
import com.tenant.manager.dto.TenantDto;
import com.tenant.manager.model.Branch;
import com.tenant.manager.model.Tenant;

public class TenantUtils {

	public static List<TenantDto> toConvertDtoList(List<Tenant> tenantEntities) {
		List<TenantDto> tenantDtos = new ArrayList<TenantDto>();
		for (Tenant tenant : tenantEntities) {
			tenantDtos.add(toTenantDto(tenant));
		}
		return tenantDtos;
	}

	public static TenantDto toTenantDto(Tenant tenantEntitiy) {
		System.out.println(tenantEntitiy);
		TenantDto tenantDto = new TenantDto();
		tenantDto.setAddress(tenantEntitiy.getAddress());
		tenantDto.setAmount(tenantEntitiy.getAmount());
		tenantDto.setbId(tenantEntitiy.getbId());
		tenantDto.setDoj(tenantEntitiy.getDoj());
		tenantDto.setEmail(tenantEntitiy.getEmail());
		tenantDto.setGov_id(tenantEntitiy.getGov_Id());
		tenantDto.setMobile(tenantEntitiy.getMobile());
		tenantDto.setName(tenantEntitiy.getName());
		tenantDto.setRoom(tenantEntitiy.getRoom());
		tenantDto.setId(tenantEntitiy.getId());
		return tenantDto;
	}

	public static Tenant toTenantEntity(TenantDto tenantDto) {
		System.out.println(tenantDto.toString());
		Tenant tenantEntity = new Tenant();
		tenantEntity.setAddress(tenantDto.getAddress());
		tenantEntity.setAmount(tenantDto.getAmount());
		tenantEntity.setbId(tenantDto.getbId());
		tenantEntity.setDoj(tenantDto.getDoj());
		tenantEntity.setEmail(tenantDto.getEmail());
		tenantEntity.setId(tenantDto.getId());
		tenantEntity.setMobile(tenantDto.getMobile());
		tenantEntity.setName(tenantDto.getName());
		tenantEntity.setRoom(tenantDto.getRoom());
		tenantEntity.setGov_Id(tenantDto.getGov_id());
		return tenantEntity;
	}
	
	public static List<BranchDto> toBranchDtoList(List<Branch> branchEntities) {
		List<BranchDto> branchDto = new ArrayList<>();
		branchEntities.stream().forEach(b->{
			branchDto.add(new BranchDto(b.getBid(), b.getBname(), b.getHid(), b.getRooms()));
		});
		System.out.println(branchDto);
		return branchDto;
	}
	

}
