package com.yearcon.productweb.modules.service.help;

import com.yearcon.productweb.modules.dao.help.LinkDao;
import com.yearcon.productweb.modules.entity.help.HelpLink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ayong
 * @create 2018-03-05 14:03
 **/
@Service
public class LinkService {

    @Autowired
    private LinkDao linkDao;

    public List<HelpLink> findBySearchId(Integer searchId){
        return linkDao.findBySearchId(searchId);
    }
}
