package com.yearcon.productweb.modules.dao;

import com.yearcon.productweb.modules.entity.ProductCare;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProductCareDao extends CrudRepository<ProductCare,String> {
    ProductCare findByProductNo(@Param("productNo") String productNo);
}
