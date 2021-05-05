package com.vachiShop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "new")
public class NewEntity extends BaseEntity{
	
	@Column
	private Long view;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user_new;
	
	@Column(length = 100)
	private String title;
	
	@Column(length=255)
	private String shortDescription;

	@Column(length = 10000)
	private String content;
	
	@Column
	private String category;
	
	@Column
	private String linkImage;

	public Long getView() {
		return view;
	}

	public void setView(Long view) {
		this.view = view;
	}

	public UserEntity getUser_new() {
		return user_new;
	}

	public void setUser_new(UserEntity user_new) {
		this.user_new = user_new;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLinkImage() {
		return linkImage;
	}

	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}
	
	
}
