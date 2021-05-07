package com.vachiShop.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vachiShop.DTO.ProductDTO;
import com.vachiShop.entity.ProductEntity;
import com.vachiShop.repository.ProductRepo;
import com.vachiShop.service.IProductService;
import com.vachiShop.util.ProductConverter;

@Service
public class ProductService implements IProductService {
	
	@Autowired
	private ProductRepo productRepo;

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
		List<ProductEntity> products = productRepo.findAllOrderByIdDesc();
		for(int i =0;i<15;++i) {
			results.add(ProductConverter.toDTO(products.get(i)));
		}
		return results;
	}

	@Override
	public List<ProductDTO> listTopRated() {
		List<ProductDTO> results = new ArrayList<>();
		List<ProductEntity> products = productRepo.findAllOrderByRateAvgDesc();
		for(int i =0;i<15;++i) {
			results.add(ProductConverter.toDTO(products.get(i)));
		}
		return results;
	}

	@Override
	public List<ProductDTO> listTopView() {
		List<ProductDTO> results = new ArrayList<>();
		List<ProductEntity> products = productRepo.findAllOrderByViewDesc();
		for(int i =0;i<15;++i) {
			results.add(ProductConverter.toDTO(products.get(i)));
		}
		return results;
	}

}
