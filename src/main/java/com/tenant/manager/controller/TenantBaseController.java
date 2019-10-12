package com.tenant.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tenant.manager.dto.BranchDto;
import com.tenant.manager.dto.RoomDto;
import com.tenant.manager.dto.TenantDto;
import com.tenant.manager.model.Checklist;
import com.tenant.manager.model.Expences;
import com.tenant.manager.service.TenantJpaService;
import com.tenant.manager.service.TenantServiceImpl;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/v1/tenants")
public class TenantBaseController {

	@Autowired
	private TenantServiceImpl tenantService;

	@Autowired
	private TenantJpaService tenantJpaService;

	@GetMapping("/check")
	public String healthCheck() {
		return "ok";
	}

	@GetMapping("{id}")
	public ResponseEntity<TenantDto> getTenant(@PathVariable("id") int id) {
		System.out.println(id);
//		return new ResponseEntity<TenantDto>(tenantService.getTenant(id), HttpStatus.OK);
		return new ResponseEntity<TenantDto>(tenantJpaService.getTenant(id), HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<List<TenantDto>> getAllTenants() {
		/*
		 * List<TenantDto> allTenants = tenantService.getAllTenants(); return new
		 * ResponseEntity<List<TenantDto>>(allTenants, HttpStatus.OK);
		 */
		System.out.println("Sysout: " + new ResponseEntity<List<TenantDto>>(tenantJpaService.getAllTenants(), HttpStatus.OK));
		return new ResponseEntity<List<TenantDto>>(tenantJpaService.getAllTenants(), HttpStatus.OK);
	}

	@PostMapping()
	public HttpStatus addTenant(@RequestBody TenantDto newTenant) {
		System.out.println("New Tenant: " + newTenant);
		tenantJpaService.addTenant(newTenant);
		return HttpStatus.CREATED;
	}

	@DeleteMapping("{id}")
	public HttpStatus deleteTenant(@PathVariable("id") int id) {
		tenantJpaService.deleteTenant(id);
		return HttpStatus.OK;
	}

	@PutMapping(consumes = "application/json")
	public HttpStatus updateTenant(@RequestBody TenantDto updatedTenant) {
//		tenantService.updateTenant(t);

		tenantJpaService.addTenant(updatedTenant);
		return HttpStatus.OK;
	}
	
	@GetMapping("search/{hostelId}/{keyWord}")
	public ResponseEntity<List<TenantDto>> searchTenants(@PathVariable("keyWord") String keyWord, @PathVariable("hostelId") String hostelID){
		return new ResponseEntity<List<TenantDto>>(tenantJpaService.searchTenants(keyWord, hostelID), HttpStatus.OK);
	}
	
	@GetMapping("/hostels/{hostelID}")
	public ResponseEntity<List<BranchDto>> getBlocks(@PathVariable("hostelID") String hid){
		return new ResponseEntity<List<BranchDto>>(tenantService.getBranches(hid), HttpStatus.OK);
	}
	
	@GetMapping("/rooms/{branchId}")
	public ResponseEntity<List<RoomDto>> getRooms(@PathVariable("branchId") String branchId) {
		return new ResponseEntity<List<RoomDto>>(tenantService.getRoomsByBranch(branchId), HttpStatus.OK);
	}
	
	@GetMapping("/hostel/{hid}")
	public ResponseEntity<List<TenantDto>> getTenantsByHid(@PathVariable("hid") String hostelId) {
		return new ResponseEntity<List<TenantDto>>(tenantService.getTenantsByHid(hostelId), HttpStatus.OK);
	}

	@GetMapping("/checklists/bid/{bid}")
	public ResponseEntity<List<Checklist>> getChecklistsByBid(@PathVariable("bid") String bid){
		return new ResponseEntity<List<Checklist>>(tenantJpaService.getCheckListsByBid(bid),HttpStatus.OK);
	}
	
	@PostMapping("/checklists")
	public HttpStatus saveChecklist(@RequestBody Checklist checklist) {
		tenantJpaService.saveCheckList(checklist);
		return HttpStatus.CREATED;
	}
	
	@PostMapping("/expences")
	public HttpStatus saveExpence(@RequestBody Expences expence) {
		tenantJpaService.saveExpence(expence);
		return HttpStatus.CREATED;
	}
	
	@GetMapping("/expences/checklist/{id}")
	public ResponseEntity<List<Expences>> getExpencesByChecklistId(@PathVariable("id") Integer checklistID){
		return new ResponseEntity<>(tenantJpaService.getExpencesByChecklistID(checklistID), HttpStatus.OK);
	}
	
}
