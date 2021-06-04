package com.vachiShop.repository;

import javax.servlet.jsp.JspPage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vachiShop.entity.BillEntity;

@Repository
public interface BillRepo extends JpaRepository<BillEntity, Long>{

}
