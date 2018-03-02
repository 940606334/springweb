package com.yearcon.productweb.modules.service.sys;

import com.yearcon.productweb.modules.dao.sys.DicDao;
import com.yearcon.productweb.modules.entity.sys.SysDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ayong
 * @create 2018-03-02 9:36
 **/
@Service
public class DicService {
    @Autowired
    private DicDao dicDao;

    public List<SysDict> findByType(String type){
        return dicDao.findByType(type);
    }
}
