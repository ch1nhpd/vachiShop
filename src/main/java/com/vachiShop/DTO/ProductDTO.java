package com.vachiShop.DTO;

import java.util.ArrayList;
import java.util.List;

public class ProductDTO extends AbstractDTO{
	
	private Long view;
	
	private float rateAvg;

	private List<BillDTO> bills = new ArrayList<>();
	
	private List<CartDTO> carts = new ArrayList<>();
	
	private CategoryDTO category;
	
	private List<FeedbackDTO> feedbacks = new ArrayList<>(); 
	
	private UserDTO user_product;
	
	private String name;
	
	private String code;
	
	private String description;
	
	private String information;
	
	private String usage;
	
	private Long price;
	
	private Long priceSaleOff = price*(1-getSaleOff()/100);
	
	private Long saleOff;
	
	private String linkImage;

	public float getRateAvg() {
		return rateAvg;
	}

	public void setRateAvg(float rateAvg) {
		this.rateAvg = rateAvg;
	}

	public Long getPriceSaleOff() {
		return priceSaleOff;
	}

	public String getLinkImage() {
		return linkImage;
	}

	public Long getView() {
		return view;
	}

	public void setView(Long view) {
		this.view = view;
	}

	public void setPriceSaleOff(Long priceSaleOff) {
		this.priceSaleOff = priceSaleOff;
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

	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public List<BillDTO> getBills() {
		return bills;
	}

	public void setBills(List<BillDTO> bills) {
		this.bills = bills;
	}

	public List<CartDTO> getCarts() {
		return carts;
	}

	public void setCarts(List<CartDTO> carts) {
		this.carts = carts;
	}

	public CategoryDTO getCategory() {
		return category;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}

	public List<FeedbackDTO> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(List<FeedbackDTO> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public UserDTO getUser_product() {
		return user_product;
	}

	public void setUser_product(UserDTO user_product) {
		this.user_product = user_product;
	}
	
	
}
