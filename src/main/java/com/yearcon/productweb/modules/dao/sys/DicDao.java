package com.yearcon.productweb.modules.dao.sys;

import com.yearcon.productweb.modules.entity.sys.SysDict;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DicDao extends CrudRepository<SysDict,String> {
    List<SysDict> findByType(String type);
}
