package com.tenant.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tenant.manager.beans.Tenant;

@RestController
@RequestMapping("/tenant")
public class TenantBaseController {

	@Autowired
	private Tenant tenant;

	@RequestMapping("/")
	public String healthCheck() {
		return "ok";
	}

	@RequestMapping("/get")
	public Tenant getTenant(@RequestParam(name = "name", required = false, defaultValue = "Unknown") String name) {
		tenant.setName(name);
		return tenant;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, consumes = "application/json")
	public Tenant updateTenant(@RequestBody Tenant t) {
		tenant.setName(t.getName());
		tenant.setAddress(t.getAddress());
		return tenant;
	}
}
