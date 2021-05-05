package com.vachiShop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class ContactEntity extends BaseEntity{

	@Column
	private String sdt;
	
	@Column
	private String name;
	
	@Column
	private boolean checked;
}
