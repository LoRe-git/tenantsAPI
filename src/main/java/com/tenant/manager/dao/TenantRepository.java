package com.tenant.manager.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tenant.manager.model.Tenant;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Integer>{
	@Query("FROM Tenant t where t.bId like :hId% and LOWER(t.name) like %:key%"
            + " or LOWER(t.address) like %:key% or LOWER(t.mobile) like %:key% or LOWER(t.gov_id) like %:key% or LOWER(t.room) like %:key% " )
    public List<Tenant> searchBy(@Param("key") String key, @Param("hId") String hId);
}
