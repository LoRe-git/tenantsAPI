package com.tenant.manager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tenant.manager.model.Tenant;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Integer>{

}
