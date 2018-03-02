package com.yearcon.productweb.daotest;

import com.yearcon.productweb.modules.dao.sys.DicDao;
import com.yearcon.productweb.modules.entity.sys.SysDict;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author ayong
 * @create 2018-03-02 9:29
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class DaoTest {
    @Autowired
    private DicDao dicDao;

    @Test
    public void testDic(){
        List<SysDict> help_type = dicDao.findByType("help_type");
        System.out.println(help_type);
    }
}
