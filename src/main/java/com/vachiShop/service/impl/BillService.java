package com.vachiShop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vachiShop.DTO.BillDTO;
import com.vachiShop.DTO.BillProductDTO;
import com.vachiShop.entity.BillEntity;
import com.vachiShop.entity.BillProductEntity;
import com.vachiShop.entity.CartEntity;
import com.vachiShop.entity.ProductCartEntity;
import com.vachiShop.entity.StatusOfBillEntity;
import com.vachiShop.repository.BillProductRepo;
import com.vachiShop.repository.BillRepo;
import com.vachiShop.repository.CartRepo;
import com.vachiShop.repository.ProductCartRepo;
import com.vachiShop.repository.ProductRepo;
import com.vachiShop.repository.StatusOfBillRepo;
import com.vachiShop.service.IBillService;
import com.vachiShop.util.BillConveter;

@Service
public class BillService implements IBillService{
	
	@Autowired
	private BillRepo billRepo;
	
	@Autowired
	private ProductRepo productRepo;
	
	@Autowired 
	private StatusOfBillRepo statusOfBillRepo;
	
	@Autowired
	private ProductCartRepo productCartRepo;
	
	@Autowired
	private CartRepo cartRepo;
	
	@Autowired
	private BillProductRepo billProductRepo;

	@Override
	public void save(BillDTO bill) {
		StatusOfBillEntity status = statusOfBillRepo.findOne(1l);
		//user
		BillEntity billEntity = BillConveter.toEntity(bill);
		billEntity.setStatus(status);
		//set User
		billEntity = billRepo.save(billEntity);
		
		for (BillProductDTO billProductDTO : bill.getBillProducts()) {
			productCartRepo.delete(productCartRepo.findOneByCartOfProduct(cartRepo.findOne(billProductDTO.getIdBill())));
			
			BillProductEntity billProductEntity = new BillProductEntity();
			billProductEntity.setQuantity(billProductDTO.getQuantity());
			billProductEntity.setProductOnBill(productRepo.findOne(billProductDTO.getIdProduct()));
			billProductEntity.setBill(billEntity);
			
			billProductRepo.save(billProductEntity);
		}
		
	}

}
