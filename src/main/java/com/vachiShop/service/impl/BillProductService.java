package com.vachiShop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vachiShop.DTO.BillProductDTO;
import com.vachiShop.repository.BillProductRepo;
import com.vachiShop.repository.BillRepo;
import com.vachiShop.service.IBillProductService;

@Service
public class BillProductService implements IBillProductService {
	
	@Autowired
	private BillProductRepo billProductRepo;
	
	@Autowired
	private BillRepo billRepo;



}
