package com.tenant.manager.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "checklist")
public class Checklist implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer checklist_id;
	@Column(name="bid")
	private String bid;
	@Column
	private Date checklist_date;
	@Column
	private String incharge_name;
	@Column
	private Integer opening_balance;
	@Column
	private Integer admissions;
	@Column
	private Integer vacancies;
	@Column
	private Integer notice_periods;
	@Column
	private String complaints;
	@Column
	private Integer collections_cash;
	@Column
	private Integer collections_ac;
	@Column
	private Integer collections_pending;
	@Column
	private Integer closing_balance;
	@Column
	private Integer water_tankers;
	@Column
	private String misc;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="checklist_id", referencedColumnName="checklist_id")
	private Set<Expences> expences;
	
	public Integer getChecklist_id() {
		return checklist_id;
	}

	public void setChecklist_id(Integer checklist_id) {
		this.checklist_id = checklist_id;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public Date getChecklist_date() {
		return checklist_date;
	}

	public void setChecklist_date(Date checklist_date) {
		this.checklist_date = checklist_date;
	}

	public String getIncharge_name() {
		return incharge_name;
	}

	public void setIncharge_name(String incharge_name) {
		this.incharge_name = incharge_name;
	}

	public Integer getOpening_balance() {
		return opening_balance;
	}

	public void setOpening_balance(Integer opening_balance) {
		this.opening_balance = opening_balance;
	}

	public Integer getAdmissions() {
		return admissions;
	}

	public void setAdmissions(Integer admissions) {
		this.admissions = admissions;
	}

	public Integer getVacations() {
		return vacancies;
	}

	public void setVacations(Integer vacations) {
		this.vacancies = vacations;
	}

	public Integer getNotice_periods() {
		return notice_periods;
	}

	public void setNotice_periods(Integer notice_periods) {
		this.notice_periods = notice_periods;
	}

	public String getComplaints() {
		return complaints;
	}

	public void setComplaints(String complaints) {
		this.complaints = complaints;
	}

	public Integer getCollections_cash() {
		return collections_cash;
	}

	public void setCollections_cash(Integer collections_cash) {
		this.collections_cash = collections_cash;
	}

	public Integer getCollections_ac() {
		return collections_ac;
	}

	public void setCollections_ac(Integer collections_ac) {
		this.collections_ac = collections_ac;
	}

	public Integer getCollections_pending() {
		return collections_pending;
	}

	public void setCollections_pending(Integer collections_pending) {
		this.collections_pending = collections_pending;
	}

	public Integer getClosing_balance() {
		return closing_balance;
	}

	public void setClosing_balance(Integer closing_balance) {
		this.closing_balance = closing_balance;
	}

	public Integer getWater_tankers() {
		return water_tankers;
	}

	public void setWater_tankers(Integer water_tankers) {
		this.water_tankers = water_tankers;
	}

	public String getMisc() {
		return misc;
	}

	public void setMisc(String misc) {
		this.misc = misc;
	}

	public Set<Expences> getExpences() {
		return expences;
	}

	public void setExpences(Set<Expences> expences) {
		this.expences = expences;
	}

	@Override
	public String toString() {
		return "Checklist [checklist_id=" + checklist_id + ", bid=" + bid + ", checklist_date=" + checklist_date
				+ ", incharge_name=" + incharge_name + ", opening_balance=" + opening_balance + ", admissions="
				+ admissions + ", vacancies=" + vacancies + ", notice_periods=" + notice_periods + ", complaints="
				+ complaints + ", collections_cash=" + collections_cash + ", collections_ac=" + collections_ac
				+ ", collections_pending=" + collections_pending + ", closing_balance=" + closing_balance
				+ ", water_tankers=" + water_tankers + ", misc=" + misc + ", expences=" + expences + "]";
	}

}
