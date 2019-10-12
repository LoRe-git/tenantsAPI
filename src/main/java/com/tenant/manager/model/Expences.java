package com.tenant.manager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expences")
public class Expences {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer expences_id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private Integer cost;
	@Column(name = "checklist_id")
	private Integer checklistid;

	public Integer getExpence_id() {
		return expences_id;
	}

	public void setExpence_id(Integer expence_id) {
		this.expences_id = expence_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Integer getChecklist_id() {
		return checklistid;
	}

	public void setChecklist_id(Integer checklist_id) {
		this.checklistid = checklist_id;
	}

}
