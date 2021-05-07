package com.vachiShop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity{
	
	@Column
	private Long view;
	
	@Column
	private float rateAvg;
	
	@ManyToMany(mappedBy="products_on_bill")
	private List<BillEntity> bills = new ArrayList<>();
	
	@ManyToMany(mappedBy = "products_on_cart")
	private List<CartEntity> carts = new ArrayList<>();
	
	@ManyToMany(mappedBy = "products_on_favorite")
	private List<FavoriteProductEntity> favorites = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private CategoryEntity category;
	
	@OneToMany(mappedBy = "product")
	private List<FeedbackEntity> feedbacks = new ArrayList<>(); 
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user_product;
	
	@Column
	private String name;
	
	@Column
	private String code;
	
	@Column(length=2000)
	private String description;
	
	@Column(length=2000)
	private String information;
	
	@Column(length=2000)
	private String usage;
	
	@Column
	private Long price;
	
	@Column
	private Long saleOff;
	
	@Column
	private String linkImage;
	
	

	public float getRateAvg() {
		return rateAvg;
	}

	public void setRateAvg(float rateAvg) {
		this.rateAvg = rateAvg;
	}

	public String getLinkImage() {
		return linkImage;
	}

	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}

	public Long getSaleOff() {
		return saleOff;
	}

	public void setSaleOff(Long saleOff) {
		this.saleOff = saleOff;
	}

	public List<BillEntity> getBills() {
		return bills;
	}

	public void setBills(List<BillEntity> bills) {
		this.bills = bills;
	}

	public List<CartEntity> getCarts() {
		return carts;
	}

	public void setCarts(List<CartEntity> carts) {
		this.carts = carts;
	}

	public Long getView() {
		return view;
	}

	public void setView(Long view) {
		this.view = view;
	}

	public List<FavoriteProductEntity> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<FavoriteProductEntity> favorites) {
		this.favorites = favorites;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public List<FeedbackEntity> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(List<FeedbackEntity> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public UserEntity getUser_product() {
		return user_product;
	}

	public void setUser_product(UserEntity user_product) {
		this.user_product = user_product;
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

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	
}
