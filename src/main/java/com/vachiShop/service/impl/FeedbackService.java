package com.vachiShop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vachiShop.entity.FeedbackEntity;
import com.vachiShop.repository.FeedbackRepo;
import com.vachiShop.service.IFeedbackService;

@Service
public class FeedbackService implements IFeedbackService{
	
	@Autowired
	private FeedbackRepo feedbackRepo;

	@Override
	public float rateAvg(long id) {
		List<FeedbackEntity> listFeedback = feedbackRepo.findByProduct_id(id);
		float s = 0;
		for (FeedbackEntity feedbackEntity : listFeedback) {
			s+=feedbackEntity.getRate();
		}
		return s/listFeedback.size();
	}

}
