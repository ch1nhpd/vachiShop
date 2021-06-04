package com.vachiShop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.vachiShop.DTO.ProductDTO;
import com.vachiShop.entity.ProductEntity;
import com.vachiShop.repository.CategoryRepo;
import com.vachiShop.repository.ProductRepo;
import com.vachiShop.service.IProductService;
import com.vachiShop.specification.SpecificationProduct;
import com.vachiShop.util.ProductConverter;

@Service
public class ProductService implements IProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private CategoryRepo categoryRepo;

	@Override
	public List<ProductDTO> listSaleOff() {
		List<ProductDTO> results = new ArrayList<>();
		List<ProductEntity> products = productRepo.findBySaleOffGreaterThan(0l);
		for(int i =0;i<15;++i) {
			results.add(ProductConverter.toDTO(products.get(i)));
		}
		return results;
	}

	@Override
	public List<ProductDTO> listLatest() {
		List<ProductDTO> results = new ArrayList<>();
		List<ProductEntity> products = productRepo.findAllByOrderByIdDesc();
		for(int i =0;i<15;++i) {
			results.add(ProductConverter.toDTO(products.get(i)));
		}
		return results;
	}

	@Override
	public List<ProductDTO> listTopRated() {
		List<ProductDTO> results = new ArrayList<>();
		List<ProductEntity> products = productRepo.findAllByOrderByRateAvgDesc();
		for(int i =0;i<15;++i) {
			results.add(ProductConverter.toDTO(products.get(i)));
		}
		return results;
	}

	@Override
	public List<ProductDTO> listTopView() {
		List<ProductDTO> results = new ArrayList<>();
		List<ProductEntity> products = productRepo.findAllByOrderByViewDesc();
		for(int i =0;i<15;++i) {
			results.add(ProductConverter.toDTO(products.get(i)));
		}
		return results;
	}

	@Override
	public ProductDTO findByCode(String code) {
		return ProductConverter.toDTO(productRepo.findByCode(code));
	}

	@Override
	public List<ProductDTO> listRelated(ProductDTO product) {
		List<ProductDTO> listResult = new ArrayList<>();
		List<ProductEntity> nameRelate = productRepo.findByNameContaining(product.getName());
		int sizeOfNameRelate = nameRelate.size();
		if(sizeOfNameRelate<=8) {
			for(int i = 0;i<sizeOfNameRelate;++i) {
				listResult.add(ProductConverter.toDTO(nameRelate.get(i)));
			}
			List<ProductEntity> categoryRelate = categoryRepo.findOne(product.getCategory().getId()).getProducts();
			for(int i = sizeOfNameRelate;i<8;++i) {
				listResult.add(ProductConverter.toDTO(categoryRelate.get(i)));
			}
		}
		return null;
	}

	@Override
	public List<ProductDTO> searchResults(Map<String, String> params) {
		SpecificationProduct specificationProduct = new SpecificationProduct(params);
		Page<ProductEntity> productsEntity =  productRepo.findAll(specificationProduct, 
				new PageRequest(12*(Integer.parseInt(params.get("page"))-1), 12*Integer.parseInt(params.get("page"))));
		List<ProductDTO> listResults = new ArrayList<>();
		for (ProductEntity productEntity : productsEntity) {
			listResults.add(ProductConverter.toDTO(productEntity));
		}
		return listResults;
	}




}
