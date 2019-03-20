package com.tenant.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tenant.manager.beans.Tenant;
import com.tenant.manager.model.Person;
import com.tenant.manager.service.TenantService;

@RestController
@RequestMapping("tenant")
public class TenantBaseController {

	@Autowired
	private Tenant tenant;
	
	@Autowired
	private TenantService tenantService;

	@GetMapping("/")
	public String healthCheck() {
		return "ok";
	}

	@GetMapping("get/{id}")
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
	
	@GetMapping("allTenants")
	public ResponseEntity<List<Person>> getAllTenants(){
		List<Person> allTenants = tenantService.getAllTenants();
		return new ResponseEntity<List<Person>>(allTenants, HttpStatus.OK);
	}
}
