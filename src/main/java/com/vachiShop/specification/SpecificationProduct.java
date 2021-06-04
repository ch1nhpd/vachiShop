package com.vachiShop.specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.vachiShop.entity.ProductEntity;

public class SpecificationProduct implements Specification<ProductEntity>{
	
	private Map<String, String> params;
	
	public SpecificationProduct(Map<String, String> params) {
		super();
		this.params = params;
	}

	@Override
	public Predicate toPredicate(Root<ProductEntity> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		List<Predicate> predicate = new ArrayList<>();
		if(params.get("name")!=null) {
			predicate.add(cb.and(cb.like(root.get("name"), "%"+params.get("name")+"%")));
		}
		if(params.get("category_id")!=null) {
			predicate.add(cb.and(cb.equal(root.get("category_id"), Long.parseLong(params.get("category_id")))));
		}
		if(params.get("rateAvg")!=null) {
			predicate.add(cb.and(cb.greaterThan(root.get("rateAvg"), Float.parseFloat(params.get("rateAvg")))));
		}
		if(params.get("priceX")!=null&&params.get("priceY")!=null) {
			predicate.add(cb.and(cb.between(root.get("price"), Long.parseLong(params.get("priceX")),Long.parseLong(params.get("priceY")))));
		}
		if(params.get("saleOff")!=null) {
			predicate.add(cb.and(cb.greaterThan(root.get("saleOff"), 0l)));
		}
		return cb.and(predicate.toArray(new Predicate[predicate.size()]));
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}
	
}
