package com.yearcon.productweb.modules.dao.help;

import com.yearcon.productweb.modules.entity.help.HelpLink;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface LinkDao extends CrudRepository<HelpLink,String> {

    List<HelpLink> findBySearchId(Integer searchId);
}
