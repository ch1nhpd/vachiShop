package com.vachiShop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "status_bill")
public class StatusOfBillEntity extends BaseEntity{

	@Column
	private String name;
	
	@OneToMany(mappedBy="status")
	private List<BillEntity> bills = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BillEntity> getBills() {
		return bills;
	}

	public void setBills(List<BillEntity> bills) {
		this.bills = bills;
	}
	
	
	
}
