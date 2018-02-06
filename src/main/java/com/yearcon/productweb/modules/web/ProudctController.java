package com.yearcon.productweb.modules.web;

import com.yearcon.productweb.common.annotation.LoggerManage;
import com.yearcon.productweb.modules.entity.ProductCare;
import com.yearcon.productweb.modules.service.ProductCareService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ayong
 * @create 2018-02-05 14:15
 **/
@Controller
public class ProudctController {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ProductCareService productCareService;

    @LoggerManage(logDescription = "获取产品详情")
    @RequestMapping(value = "article/{productNo}")
    public String article(@PathVariable("productNo")String productNo, Model model){
        logger.info("productNo="+productNo);
        ProductCare productCare=productCareService.findByProductNo(productNo);
        if(productCare==null){
            model.addAttribute("msg","该货号的文章为空");
            return "error/error";
        }
        model.addAttribute("content", productCare.getContent());
        return "modules/product/article";
    }
}
