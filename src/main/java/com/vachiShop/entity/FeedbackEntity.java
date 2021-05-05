package com.vachiShop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class FeedbackEntity extends BaseEntity{
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private ProductEntity product;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user_feedback;

	@Column(length = 1024)
	private String content;
	
	@Column
	private int rate;

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public UserEntity getUser_feedback() {
		return user_feedback;
	}

	public void setUser_feedback(UserEntity user_feedback) {
		this.user_feedback = user_feedback;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	
	
	
}
