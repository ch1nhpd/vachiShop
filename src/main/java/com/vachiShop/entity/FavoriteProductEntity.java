package com.vachiShop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "favorite")
public class FavoriteProductEntity extends BaseEntity{

	@OneToOne
	@JoinColumn(name = "user_id")
	private UserEntity user_favorite;
	
	@ManyToMany
	@JoinTable(name = "favorite_product", joinColumns = @JoinColumn(name  = "favorite_id"),
										inverseJoinColumns = @JoinColumn(name = "product_id"))
	private List<ProductEntity> products_on_favorite = new ArrayList<>();


	
	public UserEntity getUser_favorite() {
		return user_favorite;
	}

	public void setUser_favorite(UserEntity user_favorite) {
		this.user_favorite = user_favorite;
	}

	public List<ProductEntity> getProducts_on_favorite() {
		return products_on_favorite;
	}

	public void setProducts_on_favorite(List<ProductEntity> products_on_favorite) {
		this.products_on_favorite = products_on_favorite;
	}


	
	
}
