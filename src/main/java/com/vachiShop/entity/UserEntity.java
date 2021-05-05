package com.vachiShop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity{
	
	@OneToMany(mappedBy = "user")
	private List<BillEntity> bills = new ArrayList<>();
	
	@OneToOne(mappedBy = "user")
	private CartEntity cart;
	
	@OneToOne(mappedBy = "user_favorite")
	private FavoriteProductEntity favorite;
	
	@OneToMany(mappedBy = "user_feedback")
	private List<FeedbackEntity> feedbacks = new ArrayList<>();
	
	@OneToMany(mappedBy = "user_new")
	private List<NewEntity> news = new ArrayList<>();
	
	@OneToMany(mappedBy = "user_product")
	private List<ProductEntity> products = new ArrayList<>();
	
	@ManyToMany(mappedBy = "users")
	private List<RoleEntity> roles = new ArrayList<>();
	
	@Column
	private String userName;
	
	@Column
	private String passWord;
	
	@Column
	private String email;
	
	@Column
	private String fullName;

	public List<BillEntity> getBills() {
		return bills;
	}

	public void setBills(List<BillEntity> bills) {
		this.bills = bills;
	}

	public CartEntity getCart() {
		return cart;
	}

	public void setCart(CartEntity cart) {
		this.cart = cart;
	}

	public List<FeedbackEntity> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(List<FeedbackEntity> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public List<NewEntity> getNews() {
		return news;
	}

	public void setNews(List<NewEntity> news) {
		this.news = news;
	}

	public FavoriteProductEntity getFavorite() {
		return favorite;
	}

	public void setFavorite(FavoriteProductEntity favorite) {
		this.favorite = favorite;
	}

	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

	public List<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	
}
