package com.yearcon.productweb.modules.service;

import com.yearcon.productweb.modules.dao.ProductCareDao;
import com.yearcon.productweb.modules.entity.ProductCare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ayong
 * @create 2018-02-05 16:29
 **/
@Service
public class ProductCareService {
    @Autowired
    private ProductCareDao productCareDao;

    public ProductCare findByProductNo(String productNo){
        return productCareDao.findByProductNo(productNo);
    }
}
