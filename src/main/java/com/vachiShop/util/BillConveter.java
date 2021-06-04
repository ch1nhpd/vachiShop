package com.vachiShop.util;

import com.vachiShop.DTO.BillDTO;
import com.vachiShop.entity.BillEntity;

public class BillConveter {

	public static BillEntity toEntity(BillDTO billDTO) {
		BillEntity billEntity = new BillEntity();
		billEntity.setAddress(billDTO.getAddress());
		billEntity.setMessage(billDTO.getMessage());
		billEntity.setPhoneNumber(billDTO.getPhoneNumber());
		billEntity.setReceiver(billDTO.getReceiver());
		billEntity.setStatus(billDTO.getStatus());
//user
		
		return billEntity;
	}
}
